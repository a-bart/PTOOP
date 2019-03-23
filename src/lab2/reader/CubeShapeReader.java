package lab2.reader;


import lab2.ReaderUtil;
import lab2.shape.Cube;
import lab2.shape.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of cube side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Cube(sideLength);
    }
}
