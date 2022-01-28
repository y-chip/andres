import { Component, Input, OnInit } from '@angular/core';

@Component({
    selector: 'and-field-text',
    templateUrl: './text.component.html',
})
export class TextComponent implements OnInit {
    @Input() name!: string;

    @Input() label: string = 'label';

    @Input() value: string = '';

    constructor() {}

    ngOnInit(): void {
        if (this.name === undefined) {
            throw new Error('name is required');
        }
    }
}
