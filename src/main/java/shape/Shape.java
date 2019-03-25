package shape;


public interface Shape {
    ShapeData getShapeData();

    String getId();

    void setId(String id);

    ShapeType shapeType();
}
