import {Component, OnInit} from '@angular/core';
import {ComuneService} from '../../services/comune.service';
import {Comune} from '../../model/model';

@Component({
  selector: 'app-comuni',
  templateUrl: './comuni.component.html',
  styleUrls: ['./comuni.component.css']
})
export class ComuniComponent implements OnInit {

  comuni: Comune[] = null;

  constructor(private comuneService: ComuneService) {
    this.comuneService.getComuni().subscribe(result => {
      this.comuni = result;
    });
  }

  ngOnInit(): void {
      // This is intentional
  }

}
