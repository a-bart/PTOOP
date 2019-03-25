package lab3.shape;


import main.java.lab3.ShapeData;

public interface Shape {
    ShapeData getShapeData();

    String getId();

    void setId(String id);

    ShapeType shapeType();
}
