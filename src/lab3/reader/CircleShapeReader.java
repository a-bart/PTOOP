package lab3.reader;


import lab3.ReaderUtil;
import lab3.shape.Circle;
import lab3.shape.Shape;

public class CircleShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the radius of circle: ");
        int radius = Integer.valueOf(ReaderUtil.readLine());
        return new Circle(radius);
    }
}
