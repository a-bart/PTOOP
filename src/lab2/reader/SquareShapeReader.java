package lab2.reader;

import lab2.ReaderUtil;
import lab2.shape.Shape;
import lab2.shape.Square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of square side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Square(sideLength);
    }
}
