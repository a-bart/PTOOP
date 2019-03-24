package lab3.reader;

import lab3.ReaderUtil;
import lab3.shape.Shape;
import lab3.shape.Triangle;

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
