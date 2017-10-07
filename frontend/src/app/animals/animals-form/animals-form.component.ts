import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {AnimalsService} from "../animals.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-animals-form',
  templateUrl: './animals-form.component.html',
  styleUrls: ['./animals-form.component.css']
})
export class AnimalsFormComponent implements OnInit {

  animalService: any;

  @Input()
  animal

  @Output('cancel')
  onCancel = new EventEmitter()

  editable = true

  animals =[]

  constructor(private animalsService: AnimalsService, private route: ActivatedRoute, private router: Router) {

  }

  ngOnInit(): void {
    if (!this.animal) {
      let animal = this.route.snapshot.data.animal
      this.editable = false
      this.animal = animal || {}
    }
  }
  private refresh() {
    this.animalService.getAll()
      .subscribe(animals => this.animals = animals.animals)
  }

  delete(){
    this.animalsService.delete(this.animal.id)
      .subscribe(() => this.navigateHome())
  }

  update(){
    this.animalsService.update(this.animal)
      .subscribe(() => this.router.navigateByUrl("/animals-list"))
    this.refresh()
  }


  navigateHome() {
    this.router.navigate(['/animals-list'])
  }

}
