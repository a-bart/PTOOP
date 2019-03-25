import shape.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Cube(3));
        shapes.add(new Rectangle(3, 2));
        shapes.add(new Square(2));
        shapes.add(new Triangle(3, 4, 5));
        shapes.add(new Parallelogram(3, 4, 45));

        shapes.forEach(System.out::println);
    }
}
