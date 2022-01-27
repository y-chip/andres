import { Component, Input, OnInit } from '@angular/core';

@Component({
    selector: 'and-card',
    templateUrl: './card.component.html',
})
export class CardComponent implements OnInit {
    @Input() title: string;

    constructor() {}

    ngOnInit(): void {}
}
