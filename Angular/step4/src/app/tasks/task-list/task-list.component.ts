import { Component, OnInit, Injectable } from '@angular/core';
import { TaskServiceService } from '../../task-service.service';
import { LogServiceService } from '../../log-service.service';
import { Iuser } from '../../interface';
import { userInfo } from 'os';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})


export class TaskListComponent implements OnInit {
  family: Iuser[];
  sport: Iuser[];
  all: Iuser[][];
  val: string;

  /* tasks = ['cook', 'learn', 'cica'];
  public bool: boolean;
  handleTaskClicked(task: any) {  alert(task); }
 */
  constructor(private service: TaskServiceService, private service2: LogServiceService ) { }
  ngOnInit() {
  this.sport = this.service.getSportsCars();
  this.family = this.service.getFamilyCars();
  this.all = this.service.getAllCars();
  }
}
