package com.example.patterns.factory;

import com.example.patterns.exception.UserTypeNotSupportedException;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {
    public User create(String userType) {
        return switch (userType) {
            case "simple" -> new SimpleUser();
            case "admin" -> new AdminUser();
            default -> throw new UserTypeNotSupportedException("Not supported user type");
        };
    }
}
