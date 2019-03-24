package lab3.reader;

import lab3.ReaderUtil;
import lab3.shape.Shape;
import lab3.shape.Square;

public class SquareShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of square side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Square(sideLength);
    }
}
