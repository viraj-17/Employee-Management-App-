package com.employeeManager.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String messsage) {
        super(messsage);
    }
}
