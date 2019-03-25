package main.java.lab2.reader;


import main.java.lab2.ReaderUtil;
import main.java.lab2.shape.Circle;
import main.java.lab2.shape.Shape;

public class CircleShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the radius of circle: ");
        int radius = Integer.valueOf(ReaderUtil.readLine());
        return new Circle(radius);
    }
}
