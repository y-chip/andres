import { NgModule } from '@angular/core';
import { GirdComponent } from './gird/gird.component';
import { ColComponent } from './col/col.component';

@NgModule({
    declarations: [GirdComponent, ColComponent],
    exports: [GirdComponent, ColComponent],
})
export class ComponentModule {}
