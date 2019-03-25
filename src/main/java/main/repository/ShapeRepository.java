package main.repository;


import main.shape.Shape;

import java.util.Collection;
import java.util.List;

public interface ShapeRepository {
    void save(Shape shape);

    void saveAll(Collection<Shape> shapes);

    void update(Shape shape);

    void remove(String id);

    List<Shape> getAll();
}
