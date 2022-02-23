import {ComponentFixture, TestBed} from '@angular/core/testing';

import {ComuniComponent} from './comuni.component';
import {HttpClientTestingModule} from '@angular/common/http/testing';
import {ComuneService} from '../../services/comune.service';

describe('ComuniComponent', () => {
  let component: ComuniComponent;
  let fixture: ComponentFixture<ComuniComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ComuneService],
      declarations: [ComuniComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComuniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
