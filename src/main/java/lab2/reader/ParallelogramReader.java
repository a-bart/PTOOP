package main.java.lab2.reader;

import main.java.lab2.ReaderUtil;
import main.java.lab2.shape.Parallelogram;
import main.java.lab2.shape.Shape;

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
