package main.reader;


import main.shape.Shape;


/* Абстракция, которая считывает данные для создания или модификации фигуры */
public interface ShapeReader {
    Shape readShape();

    String shapeName();
}
