package main.shape;


import java.io.Serializable;

public class Cube extends Shape implements Serializable {

    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    public Cube() {

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

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
