package com.niit.controller;

import com.niit.exception.RestaurantAlreadyExistsException;
import com.niit.exception.RestaurantNotfoundException;
import com.niit.model.Restaurant;
import com.niit.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping("/api/v1/addRestaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) throws RestaurantAlreadyExistsException {
        return restaurantService.addRestaurantToDb(restaurant);
    }

//    @DeleteMapping("/api/v1/deleteRestaurantById/{id}")
//    public String deleteRestaurantById(@PathVariable int id) throws RestaurantNotfoundException {
//        return restaurantService.deleteRestaurant(id);
//    }

    @GetMapping("/api/v1/viewRestaurant")
    public List<Restaurant> getRestaurant() throws RestaurantNotfoundException {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants= restaurantService.viewRestaurants();
        return restaurants;
    }

}
