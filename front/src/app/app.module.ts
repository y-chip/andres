import { NgModule } from '@angular/core';
import {
    CommonModule,
    HashLocationStrategy,
    LocationStrategy,
} from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MessageService as PrimeNgMessageService } from 'primeng/api';

import { AppRoutingModule } from './app-routing.module';
import { ComponentModule } from './component/component.module';

import { AppComponent } from './app.component';
import { AppMainComponent } from './app.main.component';
import { SampleFormComponent } from './page/sample-form/sample-form.component';
import { PageComponent } from './page/page.component';
import { ApiModule } from '../gen/api.module';
import { Configuration } from '../gen/configuration';
import { environment } from '../environments/environment';
import { httpInterceptorProviders } from './http-interceptors';
import { CatComponent } from './page/cat/cat.component';

@NgModule({
    imports: [
        BrowserAnimationsModule,
        BrowserModule,
        CommonModule,
        HttpClientModule,
        AppRoutingModule,
        ComponentModule,
        ApiModule.forRoot(() => {
            return new Configuration({
                basePath: environment.apiBasePath,
            });
        }),
    ],
    declarations: [
        AppComponent,
        AppMainComponent,
        PageComponent,
        SampleFormComponent,
        CatComponent,
    ],
    providers: [
        { provide: LocationStrategy, useClass: HashLocationStrategy },
        PrimeNgMessageService,
        httpInterceptorProviders,
    ],
    bootstrap: [AppComponent],
})
export class AppModule {}
