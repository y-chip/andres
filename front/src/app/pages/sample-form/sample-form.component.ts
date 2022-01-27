import { Component, OnInit } from '@angular/core';
import { PageComponent } from '../page.component';
import { SampleFormControllerService } from '@andres/front-api';
import { tap } from 'rxjs';
import { SampleForm } from '@andres/front-api/model/models';

@Component({
    selector: 'app-sample-form',
    templateUrl: './sample-form.component.html',
    styleUrls: ['./sample-form.component.scss'],
})
export class SampleFormComponent extends PageComponent implements OnInit {
    sampleForm: SampleForm;

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
