import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import {Api} from "../api";
import {Observable} from "rxjs/Observable";
import {Animals} from "./animals";
import 'rxjs/add/operator/map'
import "rxjs/add/operator/do";

@Injectable()
export class AnimalsService {

  constructor(private http: Http, private api: Api) { }

  getAll(): Observable<any> {
    return this.http.get(this.api.animalsUrl)
      .map(response => response.json())
      .do(animals => console.log(animals))
  }

  update(animal: Animals): Observable<any>{
    return this.http.put(`${this.api.animalsUrl}/${animal.id}`, animal)
      .map(response => response.json())
  }

  delete(id: number){
    console.log(id)
    return this.http.delete(`${this.api.animalsUrl}/${id}`)
      .map(response => response.json())
  }

  addAnimal(animal: Animals): Observable<any>{
    return this.http.post(this.api.animalsUrl, animal)
  }

}
