import { Component, Injector, OnInit } from '@angular/core';
import { PageComponent } from '../page.component';
import { tap } from 'rxjs';
import { SampleFormControllerService } from '../../../gen/api/sampleFormController.service';
import { SampleForm } from '../../../gen/model/sampleForm';
import { MasterFormControllerService } from '../../../gen/api/masterFormController.service';
import { MasterForm } from '../../../gen/model/masterForm';

@Component({
    selector: 'app-sample-form',
    templateUrl: './sample-form.component.html',
})
export class SampleFormComponent extends PageComponent implements OnInit {
    id: number = 1;

    sampleForm: SampleForm | undefined;

    masterForms: MasterForm[] | undefined;

    constructor(
        private sampleFormControllerService: SampleFormControllerService,
        private masterFormControllerService: MasterFormControllerService,
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
            this.masterFormControllerService.get1().pipe(
                tap((masterForms) => {
                    this.masterForms = masterForms;
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
                .pipe(
                    tap(() => this.toastService.addSuccess('登録しました。'))
                ),
        ]);
    }
}
