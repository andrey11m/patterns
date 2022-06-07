package com.example.patterns.bridge;

import org.springframework.stereotype.Component;

@Component
public class CircleShape extends Shape {
    public CircleShape(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public String getShapeInfo() {
        return this.getClass().getSimpleName() + getShapeColor().getColor();
    }
}
