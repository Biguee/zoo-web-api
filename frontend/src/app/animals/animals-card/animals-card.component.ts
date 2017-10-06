import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-animals-card',
  templateUrl: './animals-card.component.html',
  styleUrls: ['./animals-card.component.css']
})
export class AnimalsCardComponent{

 @Input()
  animal = {}

  @Input()
  isSelected = false

  @Output('selected')
  onSelect = new EventEmitter()

  select(){
   this.onSelect.emit(this.animal)
  }

}
