package com.niit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.CONFLICT,reason="Restaurant Already Exists.!!")
public class RestaurantAlreadyExistsException extends Exception{
}
