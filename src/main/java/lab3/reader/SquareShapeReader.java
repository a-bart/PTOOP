package lab3.reader;

import lab3.shape.Shape;
import lab3.shape.Square;
import main.java.lab3.ReaderUtil;

public class SquareShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of square side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Square(sideLength);
    }
}
