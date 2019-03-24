package lab3.shape;


import lab3.ShapeData;

import java.util.UUID;

public class Triangle implements Shape {

    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private String id;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide < thirdSide
                || firstSide + thirdSide < secondSide
                || secondSide + thirdSide < firstSide) {
            throw new IllegalArgumentException();
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
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
        return ShapeType.TRIANGLE;
    }
}
