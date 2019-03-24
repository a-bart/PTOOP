package lab3.repository;

import lab3.shape.Shape;

import java.util.List;

public interface ShapeRepository {
    void save(Shape shape);

    void update(Shape shape);

    void remove(String id);

    List<Shape> getAll();
}
