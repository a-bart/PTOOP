package main.shape;


import java.io.Serializable;

public class Square extends Shape implements Serializable {

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public Square() {}

    @Override
    public String toString() {
        return "Square{" +
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
