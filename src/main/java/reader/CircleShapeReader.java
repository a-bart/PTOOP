package reader;


import shape.Circle;
import shape.Shape;
import util.ReaderUtil;

public class CircleShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the radius of circle: ");
        int radius = Integer.valueOf(ReaderUtil.readLine());
        return new Circle(radius);
    }
}
