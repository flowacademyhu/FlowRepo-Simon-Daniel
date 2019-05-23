import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bajnoksag',
  templateUrl: './bajnoksag.component.html',
  styleUrls: ['./bajnoksag.component.css']
})
export class BajnoksagComponent implements OnInit {
  arsname = 'Arsenal';
  arsplayers = ['Ozil', 'Ramsey', 'Leno'];
  /* arsplayers = this.arsplayers1.sort(); */
  arsstadium = 'Emirates';
  arsattendance = 60012;

  poolname = 'Liverpool';
  poolplayers1 = ['Salah', 'Mané', 'Firmino'];
  poolplayers = this.poolplayers1.sort();
  poolstadium = 'Anfield';
  poolattendance = 54033;

  manname = 'Manchester United';
  manplayers1 = ['Martial', 'De Gea', 'Pogba'];
  manplayers = this.manplayers1.sort();
  manstadium = 'Old Trafford';
  manattendance = 76023;
  sel: String;
  constructor() { }

  ngOnInit() {
    this.arsplayers.sort();
  }

}
