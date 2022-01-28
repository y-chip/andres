import { Component, OnInit } from '@angular/core';
import { PageComponent } from '../page.component';
import { tap } from 'rxjs';
import { SampleFormControllerService } from '../../../gen/api/sampleFormController.service';
import { SampleForm } from '../../../gen/model/sampleForm';

@Component({
    selector: 'app-sample-form',
    templateUrl: './sample-form.component.html',
})
export class SampleFormComponent extends PageComponent implements OnInit {
    sampleForm: SampleForm | undefined;

    constructor(
        private sampleFormControllerService: SampleFormControllerService
    ) {
        super();
    }

    ngOnInit(): void {
        this.http([
            this.sampleFormControllerService.get().pipe(
                tap((sampleForm) => {
                    this.sampleForm = sampleForm;
                })
            ),
        ]);
    }
}
