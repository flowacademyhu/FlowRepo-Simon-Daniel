import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-ars',
  templateUrl: './arsenal.component.html',
  styleUrls: ['./arsenal.component.css']
})
export class ArsenalComponent implements OnInit {
  @Input()
  name: String;
  @Input()
  players: String[];
  @Input()
  stadium: String;
  @Input()
  attendance: number;

  constructor() { }

  ngOnInit() {
  }

}
