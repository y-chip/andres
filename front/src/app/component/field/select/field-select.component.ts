import { Component, Input } from '@angular/core';
import { FieldComponent } from '../field.component';

@Component({
    selector: 'and-field-select',
    templateUrl: './field-select.component.html',
    providers: [{ provide: FieldComponent, useExisting: FieldSelectComponent }],
})
export class FieldSelectComponent extends FieldComponent<any> {
    @Input() options: any[] | undefined;

    @Input() optionValue: string = 'code';

    @Input() optionLabel: string = 'name';

    constructor() {
        super();
    }

    onChange(value: any | null): void {
        this.valueChange.emit(value);
    }
}
