package lab2.shape;


import lab2.ShapeData;

public class Cube implements Shape {

    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideLength=" + sideLength +
                '}';
    }

    @Override
    public ShapeData getShapeData() {
        return new ShapeData(toString());
    }
}
