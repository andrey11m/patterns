package com.example.patterns.bridge;

import org.springframework.stereotype.Component;

@Component
public class RedShapeColor implements ShapeColor {
    @Override
    public String getColor() {
        return " red color";
    }
}
