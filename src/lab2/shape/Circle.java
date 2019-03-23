package lab2.shape;


import lab2.ShapeData;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
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
}
