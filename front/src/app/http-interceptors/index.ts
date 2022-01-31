import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { ConvertDateInterceptor } from './convert-date-interceptor';

export const httpInterceptorProviders = [
    {
        provide: HTTP_INTERCEPTORS,
        useClass: ConvertDateInterceptor,
        multi: true,
    },
];
