package com.niit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Restaurant {
    @Id
    private int restaurantId;
    private String restaurantName;
    private RestaurantAddress restaurantAddress;
    private List<Dishes> dishes;
    private String typeOfRestaurant;
    private String image;

    public Restaurant() {
    }

    public Restaurant(int restaurantId, String restaurantName, RestaurantAddress restaurantAddress, List<Dishes> dishes, String typeOfRestaurant, String image) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.dishes = dishes;
        this.typeOfRestaurant = typeOfRestaurant;
        this.image = image;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public RestaurantAddress getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(RestaurantAddress restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public List<Dishes> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dishes> dishes) {
        this.dishes = dishes;
    }

    public String getTypeOfRestaurant() {
        return typeOfRestaurant;
    }

    public void setTypeOfRestaurant(String typeOfRestaurant) {
        this.typeOfRestaurant = typeOfRestaurant;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantAddress=" + restaurantAddress +
                ", dishes=" + dishes +
                ", typeOfRestaurant='" + typeOfRestaurant + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
