import { Component, Injector, OnInit } from '@angular/core';
import { PageComponent } from '../page.component';
import { tap } from 'rxjs';
import { SampleFormControllerService } from '../../../gen/api/sampleFormController.service';
import { SampleForm } from '../../../gen/model/sampleForm';
import { ToastService } from '../../service/toast.service';

@Component({
    selector: 'app-sample-form',
    templateUrl: './sample-form.component.html',
})
export class SampleFormComponent extends PageComponent implements OnInit {
    id: number = 1;

    sampleForm: SampleForm | undefined;

    constructor(
        private sampleFormControllerService: SampleFormControllerService,
        private toastService: ToastService,
        injector: Injector
    ) {
        super(injector);
    }

    ngOnInit(): void {
        this.http([
            this.sampleFormControllerService.get(this.id).pipe(
                tap((sampleForm) => {
                    this.sampleForm = sampleForm;
                })
            ),
        ]);
    }

    onSubmit(): void {
        if (this.sampleForm === undefined) {
            throw new Error('sampleForm is required');
        }
        this.http([
            this.sampleFormControllerService
                .put(this.id, this.sampleForm)
                .pipe(tap(() => this.toastService.addInfo('登録しました。'))),
        ]);
    }
}
