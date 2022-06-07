package com.example.patterns.bridge;

import org.springframework.stereotype.Component;

@Component
public class TriangleShape extends Shape {
    public TriangleShape(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public String getShapeInfo() {
        return this.getClass().getSimpleName() + getShapeColor().getColor();
    }
}
