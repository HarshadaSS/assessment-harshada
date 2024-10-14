package com.assessment.harshada.controller;

import com.assessment.harshada.bean.GlobalResponseHandler;
import com.assessment.harshada.entity.Hotel;
import com.assessment.harshada.service.HotelService;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotel")
    public ResponseEntity<Object> getAllHotels(){
        return GlobalResponseHandler.createResponse("Here are all the hotels!",hotelService.getAllHotels(), HttpStatus.OK);
    }

    @PostMapping("/hotel")
    public ResponseEntity<Object> saveHotel(@RequestBody Hotel hotel){
        return GlobalResponseHandler.createResponse("Saved Hotel!",hotelService.addHotel(hotel),HttpStatus.CREATED);
    }
    @PutMapping("/hotel/{id}")
    public ResponseEntity<Object> updateHotel(@PathVariable Long id, @RequestBody Hotel hotel){
        return GlobalResponseHandler.createResponse("Updated Hotel",hotelService.updateHotel(id,hotel),HttpStatus.OK);
    }
    @DeleteMapping("/hotel/{id}")
    public ResponseEntity<Object> deleteHotel(@PathVariable Long id){
        hotelService.deleteHotel(id);
        return GlobalResponseHandler.createResponse("Deleted Hotel",HttpStatus.OK);
    }

}
