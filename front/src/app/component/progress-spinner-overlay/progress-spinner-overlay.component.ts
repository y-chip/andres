import { Component, OnDestroy, OnInit } from '@angular/core';
import { animate, style, transition, trigger } from '@angular/animations';
import { ProgressSpinnerOverlayService } from '../../service/progress-spinner-overlay.service';
import { Subscription } from 'rxjs';

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
export class ProgressSpinnerOverlayComponent implements OnInit, OnDestroy {
    showCnt: number = 0;

    private subscription = new Subscription();

    constructor(
        private progressSpinnerOverlayService: ProgressSpinnerOverlayService
    ) {}

    ngOnInit(): void {
        this.subscription.add(
            this.progressSpinnerOverlayService.show$.subscribe(
                () => this.showCnt++
            )
        );
        this.subscription.add(
            this.progressSpinnerOverlayService.hide$.subscribe(
                () => this.showCnt--
            )
        );
    }

    ngOnDestroy(): void {
        this.subscription.unsubscribe();
    }
}
