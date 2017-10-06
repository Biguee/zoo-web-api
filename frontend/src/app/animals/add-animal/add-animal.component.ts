import { Component, OnInit } from '@angular/core';
import {AnimalsService} from "../animals.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-add-animal',
  templateUrl: './add-animal.component.html',
  styleUrls: ['./add-animal.component.css']
})
export class AddAnimalComponent implements OnInit {

  private animal = {
    id: 0,
    name: '',
    amount: 0,
    kind: '',
    statusinthewild: '',
    lifespan: 0,
    worldrange: ''
  };

  private registerResult: boolean;

  constructor(private animalService: AnimalsService, private router: Router) { }

  addAnimal(){
    this.animalService.addAnimal(this.animal)
      .subscribe(()=> this.router.navigateByUrl("/animals-list"))
  };

  ngOnInit() {
  }

}
