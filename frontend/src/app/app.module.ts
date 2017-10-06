import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AddAnimalComponent } from './animals/add-animal/add-animal.component';
import { AnimalsCardComponent } from './animals/animals-card/animals-card.component';
import { AnimalsFormComponent } from './animals/animals-form/animals-form.component';
import { AnimalsListComponent } from './animals/animals-list/animals-list.component';
import {AnimalsModule} from "./animals/animals.module";
import {AnimalsService} from "./animals/animals.service";
import {Api} from "./api";
import {routerModule} from "./app.routing";

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AnimalsModule,
    routerModule,
  ],
  providers: [AnimalsService, Api],
  bootstrap: [AppComponent]
})
export class AppModule { }
