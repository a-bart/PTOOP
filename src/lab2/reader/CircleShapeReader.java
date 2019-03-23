package lab2.reader;


import lab2.shape.Circle;
import lab2.shape.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleShapeReader implements ShapeReader {

    @Override
    public Shape readShape() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the radius of circle: ");
        int radius = Integer.valueOf(bufferedReader.readLine());
        bufferedReader.close();
        return new Circle(radius);
    }
}
