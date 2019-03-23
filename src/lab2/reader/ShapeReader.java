package lab2.reader;


import lab2.shape.Shape;

import java.io.IOException;

public interface ShapeReader {
    Shape readShape() throws IOException;
}
