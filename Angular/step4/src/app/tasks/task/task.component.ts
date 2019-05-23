import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { LogServiceService } from '../../log-service.service';
import { Iuser } from '../../interface';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {
  @Input()
  name: string;
  @Input()
  lastname: string;
  @Input()
  bool: boolean;
  public statusz = 0;
  onClick() {
  this.statusz += 10;
  if (this.statusz === 100) { this.taskClicked.next(this.name); }
}
@Output()
taskClicked = new EventEmitter<string>();
  
  constructor(private service: LogServiceService) { }

  user : Iuser[];

  public asd(){}
  ngOnInit() {}

}


