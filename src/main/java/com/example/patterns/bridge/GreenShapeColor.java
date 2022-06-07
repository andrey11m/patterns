package com.example.patterns.bridge;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GreenShapeColor implements ShapeColor {
    @Override
    public String getColor() {
        return " green color";
    }
}
