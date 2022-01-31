import {
    Component,
    ElementRef,
    EventEmitter,
    Input,
    Output,
    ViewChild,
} from '@angular/core';

@Component({ template: '' })
export class FieldComponent<T> {
    @ViewChild('field') field: ElementRef | undefined;

    @Input() name: string = 'name';

    @Input() label: string = 'label';

    @Input() value: T | null = null;

    @Output() valueChange = new EventEmitter<T | null>();

    isForceDirty: boolean = false;

    isForceInvalid: boolean = false;

    invalidMessage: string = '';
}
