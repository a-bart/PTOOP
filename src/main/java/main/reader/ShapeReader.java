package main.reader;


import main.shape.Shape;

public interface ShapeReader {
    Shape readShape();

    String shapeName();
}
