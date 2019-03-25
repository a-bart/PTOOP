package main.util;

import main.shape.Shape;

public class ShapeDrawer {
    public void drawShape(Shape shape) {
        System.out.println(shape.getShapeData().getData());
    }
}
