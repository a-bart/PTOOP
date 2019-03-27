package main.util;

import main.shape.Shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShapeCollection {
    private List<Shape> shapes;

    public ShapeCollection(Collection<Shape> shapes) {
        this.shapes = new ArrayList<>(shapes);
    }

    public ShapeCollection() {
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
}
