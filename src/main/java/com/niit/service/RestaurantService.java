package com.niit.service;

import com.niit.exception.RestaurantAlreadyExistsException;
import com.niit.exception.RestaurantNotfoundException;
import com.niit.model.Restaurant;
import java.util.List;

public interface RestaurantService {

     Restaurant addRestaurantToDb(Restaurant restaurant) throws RestaurantAlreadyExistsException;

//     String deleteRestaurant(int id) throws RestaurantNotfoundException;

     List<Restaurant> viewRestaurants() throws RestaurantNotfoundException;
}
