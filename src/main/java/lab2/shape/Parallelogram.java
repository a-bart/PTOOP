package main.java.lab2.shape;

import main.java.lab2.ShapeData;

public class Parallelogram implements Shape {

    private int sideA;
    private int sideB;
    private int tiltAngle;

    public Parallelogram(int sideA, int sideB, int tiltAngle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.tiltAngle = tiltAngle;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", tiltAngle=" + tiltAngle +
                '}';
    }

    @Override
    public ShapeData getShapeData() {
        return new ShapeData(toString());
    }
}
