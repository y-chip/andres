import { Component, Input } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-textarea',
    templateUrl: './field-textarea.component.html',
    providers: [
        { provide: FieldComponent, useExisting: FieldTextareaComponent },
    ],
})
export class FieldTextareaComponent extends FieldComponent<string> {
    @Input() maxlength: number | null = null;

    constructor() {
        super();
    }

    onChange(value: string | null): void {
        this.valueChange.emit(value);
    }
}
