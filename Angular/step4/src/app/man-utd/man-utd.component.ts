import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-manchester',
  templateUrl: './man-utd.component.html',
  styleUrls: ['./man-utd.component.css']
})
export class ManUtdComponent implements OnInit {
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
