import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';
import { FirstPageComponent } from './first-page/first-page.component';
import { TransactionModalComponent } from './transaction-modal/transaction-modal.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { InfoPageComponent } from './info-page/info-page.component';


@NgModule({
  declarations: [
    HomeComponent,
    FirstPageComponent,
    TransactionModalComponent,
    InfoPageComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class HomeModule { }
