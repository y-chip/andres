import { NgModule } from '@angular/core';
import { CardComponent } from './card/card.component';
import { GirdComponent } from './gird/gird.component';
import { ColComponent } from './col/col.component';

@NgModule({
    declarations: [GirdComponent, ColComponent, CardComponent],
    exports: [GirdComponent, ColComponent, CardComponent],
})
export class ComponentModule {}
