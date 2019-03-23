package lab2.shape;


import lab2.ShapeData;

public class Square implements Shape {

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
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
}
