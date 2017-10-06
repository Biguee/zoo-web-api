import { Component, OnInit } from '@angular/core';
import {Subject} from "rxjs/Subject";
import {AnimalsService} from "../animals.service";

@Component({
  selector: 'app-animals-list',
  templateUrl: './animals-list.component.html',
  styleUrls: ['./animals-list.component.css']
})
export class AnimalsListComponent{

  selected = {};
  edited = null;
  animals = [];

  private animalSubject = new Subject();

  constructor(private animalService: AnimalsService) { }

  ngOnInit(): void {
    this.refresh();
  }

  select(animal){
    this.selected = animal;
    this.edited = Object.assign({}, animal);
    console.log(animal)
  }

  private refresh() {
    this.animalService.getAll()
      .subscribe(animals => this.animals = animals.animals)
  }

  save() {
    this.animalService.update(this.edited).subscribe(() => this.refresh())
    this.reset()
  }

  reset() {
    this.selected = {}
    this.edited = null
  }

  cancel() {
    this.reset()
  }

  delete(){
    this.animalService.delete(this.edited)
    this.reset()
  }



}
