import { Component, Injector } from '@angular/core';
import { PageComponent } from '../page.component';

@Component({
    selector: 'app-cat',
    templateUrl: './cat.component.html',
})
export class CatComponent extends PageComponent {
    constructor(injector: Injector) {
        super(injector);
    }
}
