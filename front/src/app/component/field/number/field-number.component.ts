import { Component, Input } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-number',
    templateUrl: './field-number.component.html',
    providers: [{ provide: FieldComponent, useExisting: FieldNumberComponent }],
})
export class FieldNumberComponent extends FieldComponent<number> {
    @Input() min: number = -2147483648;

    @Input() max: number = 2147483647;

    constructor() {
        super();
    }

    onChange(value: number | null): void {
        this.valueChange.emit(value);
    }
}
