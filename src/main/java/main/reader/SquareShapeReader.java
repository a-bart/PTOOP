package main.reader;

import main.shape.Shape;
import main.shape.Square;
import main.util.ReaderUtil;

public class SquareShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of square side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Square(sideLength);
    }

    @Override
    public String shapeName() {
        return "square";
    }
}
