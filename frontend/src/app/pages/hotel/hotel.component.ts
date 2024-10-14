import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { getRepsonse, hotelResponse } from '../../HotelResponse';
import { HotelService } from '../../service/hotel.service';

@Component({
  selector: 'app-hotel',
  standalone: true,
  imports: [],
  templateUrl: './hotel.component.html',
  styleUrl: './hotel.component.css'
})
export class HotelComponent {

  constructor(private hotelService:HotelService){}

  hotelsList!:getRepsonse;
  filterCityList!:hotelResponse[];

  ngOnInit(){
    this.getAllHotels()
  }

  getAllHotels(){
    this.hotelService.getAllHotels().subscribe((response)=>{
      this.hotelsList=response
      console.log(this.hotelsList);
    })
  }

  filterCityMumbai(){
    this.filterCityList=[];
    this.hotelsList.data.forEach((res)=>{
      if(res.city === "Mumbai"){
        this.filterCityList.push(res);
      }
    })
    this.hotelsList.data = this.filterCityList
  }

  filterCityMysuru(){
    this.filterCityList=[];
    this.hotelsList.data.forEach((res)=>{
      if(res.city === "Mysuru"){
        this.filterCityList.push(res);
      }
    })
    this.hotelsList.data = this.filterCityList
  }

  filterCityGoa(){
    this.filterCityList=[];
    this.hotelsList.data.forEach((res)=>{
      if(res.city === "Goa"){
        this.filterCityList.push(res);
      }
    })
    this.hotelsList.data = this.filterCityList
  }
  filterCityNashik(){
    this.filterCityList=[];
    this.hotelsList.data.forEach((res)=>{
      if(res.city === "Nashik"){
        this.filterCityList.push(res);
      }
    })
    this.hotelsList.data = this.filterCityList
  }

  filterRating(rating:number){
    this.filterCityList=[];
    this.hotelsList.data.forEach((res)=>{
      if(res.rating === rating){
        this.filterCityList.push(res);
      }
    })
  }
}
