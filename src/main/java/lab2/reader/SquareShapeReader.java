package main.java.lab2.reader;

import main.java.lab2.ReaderUtil;
import main.java.lab2.shape.Shape;
import main.java.lab2.shape.Square;

public class SquareShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of square side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Square(sideLength);
    }
}
