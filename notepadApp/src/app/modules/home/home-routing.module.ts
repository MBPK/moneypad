import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FirstPageComponent } from './first-page/first-page.component';
import { HomeComponent } from './home.component';
import { InfoPageComponent } from './info-page/info-page.component';

const routes: Routes = [
  { path: '', 
    component: HomeComponent,
    children: [
      { path: '', component: FirstPageComponent},
      { path: 'info/:month', component: InfoPageComponent}
    ] }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
