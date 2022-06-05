package com.example.patterns.factory;

public class SimpleUser implements User {
    @Override
    public String announce() {
        return "Simple user in the house";
    }
}
