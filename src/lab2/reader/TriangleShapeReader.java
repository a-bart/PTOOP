package lab2.reader;

import lab2.ReaderUtil;
import lab2.shape.Triangle;
import lab2.shape.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter first side: ");
        int firstSide = Integer.valueOf(ReaderUtil.readLine());
        System.out.println("enter second side: ");
        int secondSide = Integer.valueOf(ReaderUtil.readLine());
        System.out.println("enter third side: ");
        int thirdSide = Integer.valueOf(ReaderUtil.readLine());
        return new Triangle(firstSide, secondSide, thirdSide);
    }
}
