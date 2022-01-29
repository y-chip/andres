import { Component } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-number',
    templateUrl: './field-number.component.html',
})
export class FieldNumberComponent extends FieldComponent<number> {
    constructor() {
        super();
    }

    onChange(value: number | null): void {
        this.valueChange.emit(value);
    }
}
