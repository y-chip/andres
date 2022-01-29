import { Component, HostBinding, Input } from '@angular/core';

@Component({
    selector: 'and-col',
    templateUrl: './col.component.html',
})
export class ColComponent {
    @Input() col: number = 12;

    @HostBinding('class')
    get class() {
        return `col-12 md:col-${this.col}`;
    }

    constructor() {}
}
