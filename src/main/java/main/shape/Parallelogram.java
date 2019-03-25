package main.shape;

import java.io.Serializable;

public class Parallelogram extends Shape implements Serializable {

    private int sideA;
    private int sideB;
    private int tiltAngle;

    public Parallelogram(int sideA, int sideB, int tiltAngle) {
        super(ShapeType.PARALLELOGRAM);
        this.sideA = sideA;
        this.sideB = sideB;
        this.tiltAngle = tiltAngle;
    }

    public Parallelogram() {
        super(ShapeType.PARALLELOGRAM);
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

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(int tiltAngle) {
        this.tiltAngle = tiltAngle;
    }
}
