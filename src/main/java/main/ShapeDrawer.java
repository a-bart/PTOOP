package main;

import main.shape.Shape;

import java.util.List;

public class ShapeDrawer {
    public void drawShape(Shape shape) {
        System.out.println(shape.getShapeData().getData());
    }

    public void drawAllShapes(List<Shape> shapes) {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Shape #" + (i + 1));
            drawShape(shapes.get(i));
            System.out.println();
        }
    }
}
