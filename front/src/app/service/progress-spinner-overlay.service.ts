import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class ProgressSpinnerOverlayService {
    private showSubject = new Subject();

    private hideSubject = new Subject();

    show$ = this.showSubject.asObservable();

    hide$ = this.hideSubject.asObservable();

    constructor() {}

    show(): void {
        this.showSubject.next(true);
    }

    hide(): void {
        this.hideSubject.next(true);
    }
}
