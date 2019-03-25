package main.java.lab2.reader;


import main.java.lab2.ReaderUtil;
import main.java.lab2.shape.Cube;
import main.java.lab2.shape.Shape;

public class CubeShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of cube side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Cube(sideLength);
    }
}
