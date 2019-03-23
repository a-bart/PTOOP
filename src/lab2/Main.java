package lab2;


import lab2.shape.Shape;
import lab2.shape.ShapeType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        ShapeDrawer shapeDrawer = new ShapeDrawer();

        while (true) {
            System.out.println("Enter the number of shape");
            System.out.println("1. Circle");
            System.out.println("2. Cube");
            System.out.println("3. Rectangle");
            System.out.println("4. Square");
            System.out.println("5. Triangle");
            System.out.println("6. Parallelogram");

            String line = ReaderUtil.readLine();
            if ("exit".equals(line)) break;
            Shape shape = null;
            try {
                int number = Integer.valueOf(line);
                shape = ShapeReaderFactory.reader(ShapeType.of(number)).readShape();
            } catch (NumberFormatException ex) {
                System.out.println("Enter the number:");
                continue;
            } catch (Exception e) {
                e.printStackTrace();
            }

            shapeDrawer.drowShape(shape);
        }
    }
}
