package lab3.shape;


import lab3.ShapeData;

import java.util.UUID;

public class Circle implements Shape {

    private int radius;
    private String id;

    public Circle(int radius) {
        this.radius = radius;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public ShapeData getShapeData() {
        return new ShapeData(toString());
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public ShapeType shapeType() {
        return ShapeType.CIRCLE;
    }
}
