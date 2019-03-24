package lab3.shape;

import lab3.ShapeData;

import java.util.UUID;

public class Parallelogram implements Shape {

    private int sideA;
    private int sideB;
    private int tiltAngle;
    private String id;

    public Parallelogram(int sideA, int sideB, int tiltAngle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.tiltAngle = tiltAngle;
        this.id = UUID.randomUUID().toString();
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

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public ShapeType shapeType() {
        return ShapeType.PARALLELOGRAM;
    }
}
