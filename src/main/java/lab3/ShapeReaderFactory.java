package lab3;

import lab3.reader.*;
import lab3.shape.ShapeType;

import java.util.HashMap;
import java.util.Map;

import static main.java.lab2.shape.ShapeType.*;

public class ShapeReaderFactory {

    private static Map<Integer, ShapeReader> numberShapeReader = new HashMap<>();

    static {
        numberShapeReader.put(CIRCLE.getType(), new CircleShapeReader());
        numberShapeReader.put(CUBE.getType(), new CubeShapeReader());
        numberShapeReader.put(RECTANGLE.getType(), new RectangleShapeReader());
        numberShapeReader.put(SQUARE.getType(), new SquareShapeReader());
        numberShapeReader.put(TRIANGLE.getType(), new TriangleShapeReader());
        numberShapeReader.put(PARALLELOGRAM.getType(), new ParallelogramReader());
    }

    public static ShapeReader reader(ShapeType shapeType) {
        return numberShapeReader.get(shapeType.getType());
    }
}
