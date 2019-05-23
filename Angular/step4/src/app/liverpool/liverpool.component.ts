import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-pool',
  templateUrl: './liverpool.component.html',
  styleUrls: ['./liverpool.component.css']
})
export class LiverpoolComponent implements OnInit {
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
