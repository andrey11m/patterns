package com.example.patterns.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Shape {

    private ShapeColor shapeColor;

    public abstract String getShapeInfo();
}
