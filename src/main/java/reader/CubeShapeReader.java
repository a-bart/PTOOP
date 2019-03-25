package reader;


import shape.Cube;
import shape.Shape;
import util.ReaderUtil;

public class CubeShapeReader implements ShapeReader {

    @Override
    public Shape readShape()  {
        System.out.println("enter the length of cube side: ");
        int sideLength = Integer.valueOf(ReaderUtil.readLine());
        return new Cube(sideLength);
    }
}
