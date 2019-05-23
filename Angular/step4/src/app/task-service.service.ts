import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class TaskServiceService {
  /* constructor(private http: HttpClient) { } */
  familyCars = [{
    id: 1,
    manufacturer: 'Opel',
    seats: '5',
    type: 'Astra',
    color: 'white'
  }, {
    id: 2,
    manufacturer: 'Audi',
    seats: '5',
    type: 'A3',
    color: 'gray'
  }, {
    id: 3,
  manufacturer: 'Seat',
  seats: '2',
  type: 'Cordoba',
  color: 'green'
  }];
 sportCars = [{
    id: 4,
    manufacturer: 'Ferrari',
    seats: '2',
    type: 'Enzo',
    color: 'red'
  }, {
    id: 5,
    manufacturer: 'Aston Martin',
    seats: '2',
    type: 'DB7',
    color: 'black'
  }, {
    id: 6,
  manufacturer: 'Bugatti',
  seats: '2',
  type: 'Veyron',
  color: 'white'
  }];

  getAllCars() { return [ this.familyCars, this.sportCars]; }
  getSportsCars() {return this.sportCars; }
  getFamilyCars() {return this.familyCars; }
}
