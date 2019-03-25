package main.shape;


import java.io.Serializable;

public class Cube extends Shape implements Serializable {

    private int sideLength;

    public Cube(int sideLength) {
        super(ShapeType.CUBE);
        this.sideLength = sideLength;
    }

    public Cube() {
        super(ShapeType.CUBE);
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
