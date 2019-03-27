package main.newmodule;

import main.reader.ShapeReader;
import main.shape.Shape;

public class LineReader implements ShapeReader {
    @Override
    public Shape readShape() {
        System.out.println("Enter the length of line");
        int length = main.util.ReaderUtil.readNumber();
        return new Line(length);
    }

    @Override
    public String shapeName() {
        return "line";
    }
}
