import { NgModule } from '@angular/core';
import {
    CommonModule,
    HashLocationStrategy,
    LocationStrategy,
} from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { ComponentModule } from './component/component.module';

import { AppComponent } from './app.component';
import { AppMainComponent } from './app.main.component';
import { SampleFormComponent } from './pages/sample-form/sample-form.component';

import { MenuService } from './service/app.menu.service';
import { ConfigService } from './service/app.config.service';

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
        MenuService,
        ConfigService,
    ],
    bootstrap: [AppComponent],
})
export class AppModule {}
