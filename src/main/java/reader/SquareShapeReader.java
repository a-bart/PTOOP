package reader;

import shape.Shape;
import shape.Square;
import util.ReaderUtil;

public class SquareShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of square side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Square(sideLength);
    }
}
