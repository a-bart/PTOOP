package main.reader;


import main.shape.Circle;
import main.shape.Shape;
import main.util.ReaderUtil;

public class CircleShapeReader implements ShapeReader {

    @Override
    public Shape readShape() {
        System.out.println("enter the radius of circle: ");
        int radius = Integer.valueOf(ReaderUtil.readLine());
        return new Circle(radius);
    }

    @Override
    public String shapeName() {
        return "circle";
    }
}
