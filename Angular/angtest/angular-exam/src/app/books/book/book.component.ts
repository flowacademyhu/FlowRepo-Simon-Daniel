import { Component, OnInit, Input } from '@angular/core';
import { Book } from '../book.model';
import { LoggerService } from 'src/app/logger.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  @Input()
  model: Book;
  constructor(private logger: LoggerService) { }

  ngOnInit() {
    for(let i=0; i<3; i++){
    this.logger.log(
        this.model[i].title
      );
  }
}
}
