package com.niit.service;

import com.niit.exception.RestaurantNotfoundException;
import com.niit.model.Restaurant;
import com.niit.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.RelationNotFoundException;
import java.util.List;

@Service
public class RestaurantServiceImpli implements RestaurantService{

    @Autowired
    RestaurantRepository restaurantRepository;

    public Restaurant addRestaurantToDb(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    /*@Override
    public String deleteDishes(int id) throws DishNotfoundException {
        boolean dishes = false;
        if(restaurantRepository.findById(id).isEmpty()){
            throw new DishNotfoundException();
        }
        Restaurant restaurant = restaurantRepository.findById(id).get();
        List<Dishes> dishObj = restaurant.getDishes();
        dishes = dishObj.removeIf(x->x.getDishId() == id);
        if(!dishes){
            throw new DishNotfoundException();
        }
        restaurant.setDishes(dishObj);
        return restaurantRepository.save(restaurant);
    }*/

//    @Override
//    public String deleteRestaurant(int id) throws RestaurantNotfoundException {
//        String message;
//        try {
//            restaurantRepository.deleteById(id);
//            message = "Restaurant Removed";
//        } catch (Exception exception) {
//            message = "Restaurant Not Removed";
//        }
//        return message;
//    }



    @Override
    public List<Restaurant> viewRestaurants() {
        return restaurantRepository.findAll();
    }
}
