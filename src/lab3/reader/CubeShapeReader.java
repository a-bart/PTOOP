package lab3.reader;


import lab3.ReaderUtil;
import lab3.shape.Cube;
import lab3.shape.Shape;

public class CubeShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of cube side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Cube(sideLength);
    }
}
