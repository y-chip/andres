import { finalize, forkJoin, Observable } from 'rxjs';
import { Injector } from '@angular/core';
import { ProgressSpinnerOverlayService } from '../service/progress-spinner-overlay.service';
import { MessageService } from '../service/message.service';

export class PageComponent {
    private progressSpinnerOverlayService: ProgressSpinnerOverlayService;
    private messageService: MessageService;

    constructor(private injector: Injector) {
        this.progressSpinnerOverlayService = injector.get(
            ProgressSpinnerOverlayService
        );
        this.messageService = injector.get(MessageService);
    }

    protected http<T>(task: Observable<any>[]): void {
        this.messageService.clear();
        this.progressSpinnerOverlayService.show();
        forkJoin(task)
            .pipe(finalize(() => this.progressSpinnerOverlayService.hide()))
            .subscribe({
                next: (response) => console.log(response),
                error: (error) => this.handleError(error),
            });
    }

    private handleError(response: any): void {
        this.messageService.addError(
            '通信エラー',
            '予期せぬエラーが発生しました。管理者に問い合わせてください。'
        );
        console.error(response);
    }
}
