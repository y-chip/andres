import { Component } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-text',
    templateUrl: './field-text.component.html',
})
export class FieldTextComponent extends FieldComponent<string> {
    constructor() {
        super();
    }

    onChange(value: string | null): void {
        this.valueChange.emit(value);
    }
}
