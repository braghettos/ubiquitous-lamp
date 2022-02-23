import {TestBed} from '@angular/core/testing';
import {HttpClientTestingModule} from '@angular/common/http/testing';

import {ComuneService} from './comune.service';

describe('ComuneService', () => {
  let service: ComuneService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ComuneService]
    });
    service = TestBed.inject(ComuneService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
