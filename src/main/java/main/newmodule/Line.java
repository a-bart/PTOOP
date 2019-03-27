package main.newmodule;

import main.shape.Shape;
import main.shape.ShapeData;

public class Line extends Shape {

    private int length;

    public Line(int length) {
        this.length = length;
    }

    public Line() {
    }

    @Override
    public ShapeData getShapeData() {
        return new ShapeData(toString());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }
}
