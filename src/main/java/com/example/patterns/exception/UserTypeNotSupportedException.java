package com.example.patterns.exception;

public class UserTypeNotSupportedException extends RuntimeException{
    public UserTypeNotSupportedException(String message) {
        super(message);
    }
}
