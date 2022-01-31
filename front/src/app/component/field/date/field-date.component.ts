import { Component } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-date',
    templateUrl: './field-date.component.html',
    providers: [{ provide: FieldComponent, useExisting: FieldDateComponent }],
})
export class FieldDateComponent extends FieldComponent<Date> {
    constructor() {
        super();
    }

    onChange(value: Date | null): void {
        this.valueChange.emit(value);
    }
}
