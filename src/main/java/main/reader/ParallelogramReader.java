package main.reader;

import main.shape.Parallelogram;
import main.shape.Shape;
import main.util.ReaderUtil;

public class ParallelogramReader implements ShapeReader {
    @Override
    public Shape readShape()  {
        System.out.println("enter the length of parallelogram side 1: ");
        int side1Length = Integer.valueOf(ReaderUtil.readLine());
        System.out.println("enter the length of parallelogram side 2: ");
        int side2Length = Integer.valueOf(ReaderUtil.readLine());
        System.out.println("enter the length of parallelogram tilt angle: ");
        int side3Length = Integer.valueOf(ReaderUtil.readLine());
        return new Parallelogram(side1Length, side2Length, side3Length);
    }
}
