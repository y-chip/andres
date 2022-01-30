import { finalize, forkJoin, Observable } from 'rxjs';
import { Component, Injector, QueryList, ViewChildren } from '@angular/core';
import { ProgressSpinnerOverlayService } from '../service/progress-spinner-overlay.service';
import { MessageService } from '../service/message.service';
import { ValidationError } from '../../gen/model/validationError';
import { ToastService } from '../service/toast.service';
import { FieldComponent } from '../component/field/field.component';

@Component({ template: '' })
export class PageComponent {
    private progressSpinnerOverlayService: ProgressSpinnerOverlayService;
    protected messageService: MessageService;
    protected toastService: ToastService;

    @ViewChildren(FieldComponent) fields:
        | QueryList<FieldComponent<any>>
        | undefined;

    constructor(private injector: Injector) {
        this.progressSpinnerOverlayService = injector.get(
            ProgressSpinnerOverlayService
        );
        this.messageService = injector.get(MessageService);
        this.toastService = injector.get(ToastService);
    }

    protected http<T>(task: Observable<any>[]): void {
        this.messageService.clear();
        this.clearValidationError();
        this.progressSpinnerOverlayService.show();
        forkJoin(task)
            .pipe(finalize(() => this.progressSpinnerOverlayService.hide()))
            .subscribe({
                next: (response) => console.log(response),
                error: (error) => this.handleError(error),
            });
    }

    private handleError(response: any): void {
        if (response.status === 400 && this.isValidationError(response.error)) {
            this.toastService.addError('入力エラーがあります。');
            this.showValidationError(response.error);
        } else {
            this.messageService.addError(
                '通信エラー',
                '予期せぬエラーが発生しました。管理者に問い合わせてください。'
            );
            console.error(response);
        }
    }

    private isValidationError(arg: any): arg is ValidationError {
        return (
            arg !== null &&
            typeof arg === 'object' &&
            typeof arg.fieldName === 'string' &&
            typeof arg.message === 'string'
        );
    }

    private clearValidationError(): void {
        this.fields?.forEach((f) => {
            f.isForceDirty = false;
            f.isForceInvalid = false;
            f.invalidMessage = '';
        });
    }

    private showValidationError(e: ValidationError): void {
        this.fields?.forEach((f) => {
            if (f.name === e.fieldName) {
                f.isForceDirty = true; // for show invalid message
                f.isForceInvalid = true;
                f.invalidMessage = e.message;
            }
        });
    }
}
