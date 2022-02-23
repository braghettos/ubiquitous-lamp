import {ComponentFixture, TestBed} from '@angular/core/testing';

import {NovitaComponent} from './novita.component';

describe('NovitaComponent', () => {
  let component: NovitaComponent;
  let fixture: ComponentFixture<NovitaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NovitaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NovitaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
