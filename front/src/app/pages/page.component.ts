import { forkJoin, Observable } from 'rxjs';

export class PageComponent {
    protected http<T>(task: Observable<any>[]): void {
        forkJoin(task).subscribe({
            next: (response) => console.log(response),
            error: (error) => this.handleError(error),
        });
    }

    private handleError(response: any): void {
        console.error(response);
    }
}
