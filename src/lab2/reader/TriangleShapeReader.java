package lab2.reader;

import lab2.shape.Triangle;
import lab2.shape.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleShapeReader implements ShapeReader {

    @Override
    public Shape readShape() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first side: ");
        int firstSide = Integer.valueOf(bufferedReader.readLine());
        System.out.println("enter second side: ");
        int secondSide = Integer.valueOf(bufferedReader.readLine());
        System.out.println("enter third side: ");
        int thirdSide = Integer.valueOf(bufferedReader.readLine());
        bufferedReader.close();
        return new Triangle(firstSide, secondSide, thirdSide);
    }
}
