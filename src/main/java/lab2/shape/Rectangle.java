package main.java.lab2.shape;


import main.java.lab2.ShapeData;

public class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
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
}
