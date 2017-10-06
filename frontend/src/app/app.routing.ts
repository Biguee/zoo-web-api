import {Route, RouterModule} from "@angular/router";
import {AnimalsListComponent} from "./animals/animals-list/animals-list.component";
import {AddAnimalComponent} from "./animals/add-animal/add-animal.component";

const routesConfig: [Route] = [
  {
    path: 'animals-list', component: AnimalsListComponent
  },
  {
    path: 'addAnimal', component: AddAnimalComponent
  },
  {
    path: '**', component: AnimalsListComponent
  }
]

export const routerModule = RouterModule.forRoot(routesConfig)
