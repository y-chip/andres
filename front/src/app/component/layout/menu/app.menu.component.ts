import { Component, OnInit } from '@angular/core';
import { AppMainComponent } from '../../../app.main.component';

@Component({
    selector: 'app-menu',
    template: `
        <div class="layout-menu-container">
            <ul class="layout-menu" role="menu" (keydown)="onKeydown($event)">
                <li
                    app-menu
                    class="layout-menuitem-category"
                    *ngFor="let item of model; let i = index"
                    role="none"
                >
                    <div
                        class="layout-menuitem-root-text"
                        [attr.aria-label]="item.label"
                    >
                        {{ item.label }}
                    </div>
                    <ul role="menu">
                        <li
                            app-menuitem
                            *ngFor="let child of item.items"
                            [item]="child"
                            [index]="i"
                            role="none"
                        ></li>
                    </ul>
                </li>
            </ul>
        </div>
    `,
})
export class AppMenuComponent implements OnInit {
    model!: any[];

    constructor(public appMain: AppMainComponent) {}

    ngOnInit() {
        this.model = [
            {
                label: 'Page',
                items: [
                    {
                        label: 'Sample Form',
                        icon: 'pi pi-fw pi-id-card',
                        routerLink: ['sample-form'],
                    },
                    {
                        label: 'Cat',
                        icon: 'pi pi-fw pi-id-card',
                        routerLink: ['cat'],
                    },
                ],
            },
            {
                label: 'Hierarchy Menu',
                items: [
                    {
                        label: 'Submenu',
                        icon: 'pi pi-fw pi-bookmark',
                        items: [
                            {
                                label: 'Submenu 1',
                                icon: 'pi pi-fw pi-bookmark',
                                items: [
                                    {
                                        label: 'Submenu 1.1',
                                        icon: 'pi pi-fw pi-bookmark',
                                    },
                                    {
                                        label: 'Submenu 1.2',
                                        icon: 'pi pi-fw pi-bookmark',
                                    },
                                    {
                                        label: 'Submenu 1.3',
                                        icon: 'pi pi-fw pi-bookmark',
                                    },
                                ],
                            },
                            {
                                label: 'Submenu 2',
                                icon: 'pi pi-fw pi-bookmark',
                                items: [
                                    {
                                        label: 'Submenu 2.1',
                                        icon: 'pi pi-fw pi-bookmark',
                                    },
                                ],
                            },
                        ],
                    },
                ],
            },
            {
                label: 'Normal Menu',
                items: [
                    {
                        label: 'Menu 1',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 2',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 3',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 4',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 5',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 6',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 7',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 8',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                    {
                        label: 'Menu 9',
                        icon: 'pi pi-fw pi-bookmark',
                    },
                ],
            },
        ];
    }

    onKeydown(event: KeyboardEvent) {
        const nodeElement = <HTMLDivElement>event.target;
        if (event.code === 'Enter' || event.code === 'Space') {
            nodeElement.click();
            event.preventDefault();
        }
    }
}
