package com.assessment.harshada.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "roomprice")
    private Double roomPrice;
    @Column(name = "imageurl")
    private String imageUrl;
    @Column(name = "description")
    private String description;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "city")
    private String city;
    @Column(name = "email")
    private String email;
    @Column(name = "wifi")
    private String wifi;
    @Column(name = "gym")
    private String gym;
    @Column(name = "pool")
    private String pool;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomPrice=" + roomPrice +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", wifi='" + wifi + '\'' +
                ", gym='" + gym + '\'' +
                ", pool='" + pool + '\'' +
                '}';
    }
}
