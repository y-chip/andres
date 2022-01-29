import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'and-toast',
    templateUrl: './toast.component.html',
    styles: [
        `
            :host ::ng-deep .p-toast {
                z-index: 998;
            }
        `,
    ],
})
export class ToastComponent implements OnInit {
    constructor() {}

    ngOnInit(): void {}
}
