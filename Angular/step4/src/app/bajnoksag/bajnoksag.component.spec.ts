import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BajnoksagComponent } from './bajnoksag.component';

describe('BajnoksagComponent', () => {
  let component: BajnoksagComponent;
  let fixture: ComponentFixture<BajnoksagComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BajnoksagComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BajnoksagComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
