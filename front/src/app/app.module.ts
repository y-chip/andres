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

@NgModule({
    imports: [
        BrowserAnimationsModule,
        BrowserModule,
        CommonModule,
        HttpClientModule,
        AppRoutingModule,
        ComponentModule,
    ],
    declarations: [AppComponent, AppMainComponent, SampleFormComponent],
    providers: [
        { provide: LocationStrategy, useClass: HashLocationStrategy },
        PrimeNgMessageService,
    ],
    bootstrap: [AppComponent],
})
export class AppModule {}
