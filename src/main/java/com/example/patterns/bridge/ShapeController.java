package com.example.patterns.bridge;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@Api(tags = "Bridge pattern controller")
public class ShapeController {

    private final List<Shape> shapes;
    private final List<ShapeColor> colors;

    // It's just for fun
    @GetMapping("/bridge/{shape}/{color}")
    public String createShape(@PathVariable(value = "shape") String shapeType, @PathVariable String color) {
        Shape shape = null;
        for (Shape el : shapes) {
            if (el.getClass().getSimpleName().toLowerCase().contains(shapeType)) {
                shape = el;
            }
        }
        if (shape == null) {
            return "The shape wasn't found";
        }
        for (ShapeColor el : colors) {
            if (el.getClass().getSimpleName().toLowerCase().contains(color)) {
                shape.setShapeColor(el);
            }
        }
        return shape.getShapeInfo();
    }
}
