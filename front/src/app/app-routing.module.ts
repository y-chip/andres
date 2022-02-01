import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { AppMainComponent } from './app.main.component';
import { SampleFormComponent } from './page/sample-form/sample-form.component';
import { CatComponent } from './page/cat/cat.component';

@NgModule({
    imports: [
        RouterModule.forRoot(
            [
                {
                    path: '',
                    component: AppMainComponent,
                    children: [
                        { path: 'sample-form', component: SampleFormComponent },
                        { path: 'cat', component: CatComponent },
                    ],
                },
                { path: '**', redirectTo: '' },
            ],
            { scrollPositionRestoration: 'enabled', anchorScrolling: 'enabled' }
        ),
    ],
    exports: [RouterModule],
})
export class AppRoutingModule {}
