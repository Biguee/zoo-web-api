import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HttpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";
import {AnimalsListComponent} from "./animals-list/animals-list.component";
import {AnimalsFormComponent} from "./animals-form/animals-form.component";
import {AnimalsCardComponent} from "./animals-card/animals-card.component";
import {AddAnimalComponent} from "./add-animal/add-animal.component";
import {AnimalsService} from "./animals.service";

@NgModule({
  imports: [
    CommonModule,
    HttpModule,
    FormsModule,
    RouterModule
  ],
  declarations: [
    AnimalsListComponent,
    AnimalsFormComponent,
    AnimalsCardComponent,
    AddAnimalComponent ],
  exports:[
    AnimalsListComponent,
    AnimalsFormComponent
  ],
  providers: [
    AnimalsService
  ]
})
export class AnimalsModule { }
