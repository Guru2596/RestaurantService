package com.niit.model;

public class Dishes {

    private int dishId;
    private String dishName;
    private String dishCategory;
    private int dishPrice;

    public Dishes() {
    }

    public Dishes(int dishId, String dishName, String dishCategory, int dishPrice) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.dishCategory = dishCategory;
        this.dishPrice = dishPrice;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishCategory() {
        return dishCategory;
    }

    public void setDishCategory(String dishCategory) {
        this.dishCategory = dishCategory;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }
}
