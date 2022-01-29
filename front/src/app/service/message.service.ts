import { Injectable } from '@angular/core';
import { MessageService as PrimeNgMessageService } from 'primeng/api';

@Injectable({
    providedIn: 'root',
})
export class MessageService {
    constructor(private primeNgMessageService: PrimeNgMessageService) {}

    addInfo(summary: string, detail?: string) {
        this.primeNgMessageService.add({
            key: 'message',
            severity: 'info',
            summary: summary,
            detail: detail,
        });
    }

    addSuccess(summary: string, detail?: string) {
        this.primeNgMessageService.add({
            key: 'message',
            severity: 'success',
            summary: summary,
            detail: detail,
        });
    }

    addWarn(summary: string, detail?: string) {
        this.primeNgMessageService.add({
            key: 'message',
            severity: 'warn',
            summary: summary,
            detail: detail,
        });
    }

    addError(summary: string, detail?: string) {
        this.primeNgMessageService.add({
            key: 'message',
            severity: 'error',
            summary: summary,
            detail: detail,
        });
    }

    clear() {
        this.primeNgMessageService.clear('message');
    }
}
