import { Component, Input } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-text',
    templateUrl: './field-text.component.html',
    providers: [{ provide: FieldComponent, useExisting: FieldTextComponent }],
})
export class FieldTextComponent extends FieldComponent<string> {
    @Input() maxlength: number | null = null;

    constructor() {
        super();
    }

    onChange(value: string | null): void {
        this.valueChange.emit(value);
    }
}
