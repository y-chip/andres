import { Component, Input } from '@angular/core';

@Component({
    selector: 'and-card',
    templateUrl: './card.component.html',
})
export class CardComponent {
    @Input() title: string = 'タイトル';

    constructor() {}
}
