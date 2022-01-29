import { Component, OnInit } from '@angular/core';
import { animate, style, transition, trigger } from '@angular/animations';

@Component({
    selector: 'and-progress-spinner-overlay',
    templateUrl: './progress-spinner-overlay.component.html',
    styleUrls: ['./progress-spinner-overlay.component.css'],
    animations: [
        trigger('enterLeave', [
            transition(':enter', [
                style({ opacity: 0 }),
                animate('100ms', style({ opacity: 1 })),
            ]),
            transition(':leave', [animate('100ms', style({ opacity: 0 }))]),
        ]),
    ],
})
export class ProgressSpinnerOverlayComponent implements OnInit {
    show: boolean = false;

    constructor() {}

    ngOnInit(): void {}
}
