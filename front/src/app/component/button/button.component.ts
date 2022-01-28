import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
    selector: 'and-button',
    templateUrl: './button.component.html',
})
export class ButtonComponent implements OnInit {
    @Input() label: string = 'label';

    @Output() click = new EventEmitter();

    constructor() {}

    ngOnInit(): void {}

    onClick(): void {
        this.click.emit();
    }
}
