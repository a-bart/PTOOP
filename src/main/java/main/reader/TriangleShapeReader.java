package main.reader;

import main.shape.Shape;
import main.shape.Triangle;
import main.util.ReaderUtil;

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

    @Override
    public String shapeName() {
        return "triangle";
    }
}
