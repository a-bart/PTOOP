package main.reader;


import main.shape.Rectangle;
import main.shape.Shape;
import main.util.ReaderUtil;

public class RectangleShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of rectangle length: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        System.out.println("enter the length of rectangle width: ");
        int sideWidth = Integer.valueOf(ReaderUtil.readLine());
        return new Rectangle(sideLength, sideWidth);
    }
}
