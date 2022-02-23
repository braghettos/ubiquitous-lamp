import {ComponentFixture, TestBed} from '@angular/core/testing';

import {ArgomentiComponent} from './argomenti.component';

describe('FiltriComponent', () => {
  let component: ArgomentiComponent;
  let fixture: ComponentFixture<ArgomentiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArgomentiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArgomentiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
