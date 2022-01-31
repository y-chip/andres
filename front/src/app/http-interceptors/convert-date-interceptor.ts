import {
    HttpEvent,
    HttpHandler,
    HttpInterceptor,
    HttpRequest,
    HttpResponse,
} from '@angular/common/http';
import { map, Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable()
export class ConvertDateInterceptor implements HttpInterceptor {
    private _isoDateFormat =
        /^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}(?:\.\d*)(?:\+\d{2}:\d{2})$/;

    intercept(
        req: HttpRequest<any>,
        next: HttpHandler
    ): Observable<HttpEvent<any>> {
        console.log('here');
        return next.handle(req).pipe(
            map((val: HttpEvent<any>) => {
                if (val instanceof HttpResponse) {
                    const body = val.body;
                    this.convert(body);
                }
                return val;
            })
        );
    }

    private convert(body: any): void {
        if (body === null || body === undefined) {
            return body;
        }
        if (typeof body !== 'object') {
            return body;
        }
        for (const key of Object.keys(body)) {
            const value = body[key];
            if (this.isIsoDateString(value)) {
                body[key] = new Date(value);
            } else if (typeof value === 'object') {
                this.convert(value);
            }
        }
    }

    private isIsoDateString(value: any): boolean {
        if (value === null || value === undefined) {
            return false;
        }
        if (typeof value === 'string') {
            return this._isoDateFormat.test(value);
        }
        return false;
    }
}
