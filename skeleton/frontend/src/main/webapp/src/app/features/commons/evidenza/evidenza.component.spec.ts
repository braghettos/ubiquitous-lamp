import {ComponentFixture, TestBed} from '@angular/core/testing';

import {EvidenzaComponent} from './evidenza.component';

describe('EvidenzaComponent', () => {
  let component: EvidenzaComponent;
  let fixture: ComponentFixture<EvidenzaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EvidenzaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EvidenzaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
