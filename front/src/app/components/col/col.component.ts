import { Component, HostBinding, Input, OnInit } from '@angular/core';

@Component({
    selector: 'and-col',
    templateUrl: './col.component.html',
})
export class ColComponent implements OnInit {
    @Input() col: number = 12;

    @HostBinding('class')
    get class() {
        return `col-12 md:col-${this.col}`;
    }

    constructor() {}

    ngOnInit(): void {}
}
