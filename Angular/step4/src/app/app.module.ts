import { BrowserModule } from '@angular/platform-browser';
import { NgModule, HostListener } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { TaskListComponent } from './tasks/task-list/task-list.component';
import { TaskComponent } from './tasks/task/task.component';
import { Services } from '@angular/core/src/view';
import { LogServiceService } from './log-service.service';
import { BajnoksagComponent } from './bajnoksag/bajnoksag.component';
import { ManUtdComponent } from './man-utd/man-utd.component';
import { ArsenalComponent } from './arsenal/arsenal.component';
import { LiverpoolComponent } from './liverpool/liverpool.component';
import { TaskServiceService } from './task-service.service';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TaskListComponent,
    TaskComponent,
    BajnoksagComponent,
    ManUtdComponent,
    ArsenalComponent,
    LiverpoolComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [LogServiceService, TaskServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
