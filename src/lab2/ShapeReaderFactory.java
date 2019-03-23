package lab2;


import lab2.reader.*;
import lab2.shape.ShapeType;

import java.util.HashMap;
import java.util.Map;

import static lab2.shape.ShapeType.*;

public class ShapeReaderFactory {

    private static Map<Integer, ShapeReader> numberShapeReader = new HashMap<>();

    static {
        numberShapeReader.put(CIRCLE.getType(), new CircleShapeReader());
        numberShapeReader.put(CUBE.getType(), new CubeShapeReader());
        numberShapeReader.put(RECTANGLE.getType(), new RectangleShapeReader());
        numberShapeReader.put(SQUARE.getType(), new SquareShapeReader());
        numberShapeReader.put(TRIANGLE.getType(), new TriangleShapeReader());
    }

    public static ShapeReader reader(ShapeType shapeType) {
        return numberShapeReader.get(shapeType.getType());
    }
}