import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { getRepsonse } from '../HotelResponse';

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  constructor(private httpClient:HttpClient) { }

  baseurl = "http://localhost:8080/api";

  getAllHotels():Observable<any>{
    return this.httpClient.get(this.baseurl+"/hotel");
  }

}
