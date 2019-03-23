package lab2.reader;


import lab2.shape.Rectangle;
import lab2.shape.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleShapeReader implements ShapeReader {

    @Override
    public Shape readShape() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the length of rectangle length: ");
        int sideLength = Integer.valueOf(bufferedReader.readLine());
        System.out.println("enter the length of rectangle width: ");
        int sideWidth = Integer.valueOf(bufferedReader.readLine());

        bufferedReader.close();
        return new Rectangle(sideLength, sideWidth);
    }
}
