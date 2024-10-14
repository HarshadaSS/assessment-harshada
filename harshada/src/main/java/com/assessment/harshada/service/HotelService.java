package com.assessment.harshada.service;

import com.assessment.harshada.bean.GlobalExceptionHandler;
import com.assessment.harshada.entity.Hotel;
import com.assessment.harshada.exception.EntityNotFound;
import com.assessment.harshada.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    public Hotel addHotel(Hotel hotel){
        return hotelRepository.save(hotel);
    }
    public Hotel updateHotel(Long id,Hotel hotel){
        Optional<Hotel> existingHotel = hotelRepository.findById(id);
        if(!ObjectUtils.isEmpty(existingHotel)){
            Hotel existData = existingHotel.get();
            existData.setCity(hotel.getCity());
            existData.setDescription(hotel.getDescription());
            existData.setEmail(hotel.getEmail());
            existData.setGym(hotel.getGym());
            existData.setPool(hotel.getPool());
            existData.setName(hotel.getName());
            existData.setImageUrl(hotel.getImageUrl());
            existData.setRating(hotel.getRating());
            existData.setRoomPrice(hotel.getRoomPrice());
            existData.setWifi(hotel.getWifi());
            Hotel savedHotel = hotelRepository.save(existData);
            return savedHotel;
        }
        return null;
    }

    public void deleteHotel(Long id){
        Optional<Hotel> existingHotel = hotelRepository.findById(id);
        if(!ObjectUtils.isEmpty(existingHotel)){
            hotelRepository.deleteById(id);
        }
    }
}
