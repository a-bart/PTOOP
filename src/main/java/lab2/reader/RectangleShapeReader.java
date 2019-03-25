package main.java.lab2.reader;


import main.java.lab2.ReaderUtil;
import main.java.lab2.shape.Rectangle;
import main.java.lab2.shape.Shape;

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
