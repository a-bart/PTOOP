package reader;

import shape.Shape;
import shape.Triangle;
import util.ReaderUtil;

public class TriangleShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter first side: ");
        int firstSide = Integer.valueOf(ReaderUtil.readLine());
        System.out.println("enter second side: ");
        int secondSide = Integer.valueOf(ReaderUtil.readLine());
        System.out.println("enter third side: ");
        int thirdSide = Integer.valueOf(ReaderUtil.readLine());
        return new Triangle(firstSide, secondSide, thirdSide);
    }
}
