package lab2.reader;

import lab2.ReaderUtil;
import lab2.shape.Cube;
import lab2.shape.Parallelogram;
import lab2.shape.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
