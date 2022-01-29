import { Component } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-text',
    templateUrl: './text.component.html',
})
export class TextComponent extends FieldComponent<string> {
    constructor() {
        super();
    }

    onChange(value: string | null): void {
        this.valueChange.emit(value);
    }
}
