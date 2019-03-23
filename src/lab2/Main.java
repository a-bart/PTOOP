package lab2;


import lab2.shape.Shape;
import lab2.shape.ShapeType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ShapeDrawer shapeDrawer = new ShapeDrawer();

        System.out.println("Enter the number of shape");
        System.out.println("1. Circle");
        System.out.println("2. Cube");
        System.out.println("3. Rectangle");
        System.out.println("4. Square");
        System.out.println("5. Triangle");

        int number = Integer.valueOf(reader.readLine());

        Shape shape = ShapeReaderFactory.reader(ShapeType.of(number))
                .readShape();

        shapeDrawer.drowShape(shape);
    }
}
