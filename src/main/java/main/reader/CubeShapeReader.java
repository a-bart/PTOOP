package main.reader;


import main.shape.Cube;
import main.shape.Shape;
import main.util.ReaderUtil;

public class CubeShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of cube side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Cube(sideLength);
    }

    @Override
    public String shapeName() {
        return "cube";
    }
}
