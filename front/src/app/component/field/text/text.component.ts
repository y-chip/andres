import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
    selector: 'and-field-text',
    templateUrl: './text.component.html',
})
export class TextComponent implements OnInit {
    @Input() name!: string;

    @Input() label: string = 'label';

    @Input() value: string | null = null;

    @Output() valueChange = new EventEmitter<string | null>();

    constructor() {}

    ngOnInit(): void {
        if (this.name === undefined) {
            throw new Error('name is required');
        }
    }

    onChange(value: string | null): void {
        this.valueChange.emit(value);
    }
}
