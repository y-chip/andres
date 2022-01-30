import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({ template: '' })
export class FieldComponent<T> {
    @Input() name: string = 'name';

    @Input() label: string = 'label';

    @Input() value: T | null = null;

    @Output() valueChange = new EventEmitter<T | null>();

    isForceDirty: boolean = false;

    isForceInvalid: boolean = false;

    invalidMessage: string = '';
}
