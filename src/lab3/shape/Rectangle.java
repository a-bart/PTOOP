package lab3.shape;


import lab3.ShapeData;

import java.util.UUID;

public class Rectangle implements Shape {
    private int length;
    private int width;
    private String id;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
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
        return ShapeType.RECTANGLE;
    }
}
