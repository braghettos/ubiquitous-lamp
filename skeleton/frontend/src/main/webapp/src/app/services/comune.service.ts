import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../../environments/environment';
import {Comune} from '../model/model';

@Injectable({
  providedIn: 'root'
})
export class ComuneService {

  constructor(private http: HttpClient) {
  }

  getComuni(): Observable<Comune[]> {
    const params = {};
    return this.http.get<Comune[]>(environment.API_URL + 'public/comuni', params);
  }
}
