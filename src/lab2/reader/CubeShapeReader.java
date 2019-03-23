package lab2.reader;


import lab2.shape.Cube;
import lab2.shape.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeShapeReader implements ShapeReader {

    @Override
    public Shape readShape() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the length of cube side: ");
        int sideLength = Integer.valueOf(bufferedReader.readLine());
        bufferedReader.close();
        return new Cube(sideLength);
    }
}
