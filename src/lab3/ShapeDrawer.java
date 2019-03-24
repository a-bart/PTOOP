package lab3;


import lab3.shape.Shape;

public class ShapeDrawer {
    public void drawShape(Shape shape) {
        System.out.println(shape.getShapeData().getData());
    }
}
