import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
    selector: 'and-button',
    templateUrl: './button.component.html',
})
export class ButtonComponent {
    @Input() label: string = 'label';

    @Output() click = new EventEmitter();

    constructor() {}

    onClick(event: MouseEvent): void {
        event.stopPropagation();
        this.click.emit();
    }
}
