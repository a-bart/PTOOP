package lab3.reader;


import lab3.ReaderUtil;
import lab3.shape.Rectangle;
import lab3.shape.Shape;

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
