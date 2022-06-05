package com.example.patterns.factory;

public class AdminUser implements User {
    @Override
    public String announce() {
        return "Admin user in the house";
    }
}
