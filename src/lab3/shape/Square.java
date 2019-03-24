package lab3.shape;


import lab3.ShapeData;

import java.util.UUID;

public class Square implements Shape {

    private int sideLength;
    private String id;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        this.id = UUID.randomUUID().toString();
    }

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
        return ShapeType.SQUARE;
    }
}
