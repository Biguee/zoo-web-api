export class Animals{

  id: number
  name: string
  amount: number
  kind: string
  statusinthewild: string
  lifespan: number
  worldrange: string



  constructor(json) {
    this.id = json['id'];
    this.name = json['name'];
    this.amount = json['amount'];
    this.kind = json['kind'];
    this.statusinthewild = json['statusinthewild'];
    this.lifespan = json['lifespan'];
    this.worldrange = json['range'];
  }
}
