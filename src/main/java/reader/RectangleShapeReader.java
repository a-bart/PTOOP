package reader;

import shape.Rectangle;
import shape.Shape;
import util.ReaderUtil;

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
