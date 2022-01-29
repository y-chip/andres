import { finalize, forkJoin, Observable } from 'rxjs';
import { Injector } from '@angular/core';
import { ProgressSpinnerOverlayService } from '../service/progress-spinner-overlay.service';

export class PageComponent {
    private progressSpinnerOverlayService: ProgressSpinnerOverlayService;

    constructor(private injector: Injector) {
        this.progressSpinnerOverlayService = injector.get(
            ProgressSpinnerOverlayService
        );
    }

    protected http<T>(task: Observable<any>[]): void {
        this.progressSpinnerOverlayService.show();
        forkJoin(task)
            .pipe(finalize(() => this.progressSpinnerOverlayService.hide()))
            .subscribe({
                next: (response) => console.log(response),
                error: (error) => this.handleError(error),
            });
    }

    private handleError(response: any): void {
        console.error(response);
    }
}
