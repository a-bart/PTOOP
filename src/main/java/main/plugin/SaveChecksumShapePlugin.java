package main.plugin;

import main.shape.Shape;

import java.util.Objects;

public class SaveChecksumShapePlugin implements ShapePlugin {
    @Override
    public void handle(Shape shape) {
        int hashCode = Objects.hashCode(shape);
        shape.setChecksum(hashCode);
    }
}