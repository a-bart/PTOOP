package main.repository;

import main.MainClass;
import main.plugin.ShapeHandler;
import main.plugin.ShapeHandlers;
import main.shape.Shape;

import java.util.Collection;
import java.util.List;

public class ShapeRepositories {
    private static ShapeRepository shapeRepository;

    public static ShapeRepository bsonShapeRepository() {
        if (shapeRepository == null) {
            shapeRepository = new ShapeRepositoryWrapper(MainClass.filepath);
        }
        return shapeRepository;
    }

    private static class ShapeRepositoryWrapper implements ShapeRepository {

        private ShapeRepository shapeRepository;
        private ShapeHandler shapeHandler;


        ShapeRepositoryWrapper(String filepath) {
            shapeRepository = new BsonFileShapeRepositoryImpl(filepath);
            shapeHandler = ShapeHandlers.shapeHandler();
        }

        @Override
        public void save(Shape shape) {
            if (ShapeHandlers.isEnable())
                shapeHandler.handle(shape);
            shapeRepository.save(shape);
        }

        @Override
        public void saveAll(Collection<Shape> shapes) {
            if (ShapeHandlers.isEnable())
                shapes.forEach(shapeHandler::handle);
            shapeRepository.saveAll(shapes);
        }

        @Override
        public void update(Shape shape) {
            if (ShapeHandlers.isEnable())
                shapeHandler.handle(shape);
            shapeRepository.update(shape);
        }

        @Override
        public void remove(String id) {
            shapeRepository.remove(id);
        }

        @Override
        public List<Shape> getAll() {
            return shapeRepository.getAll();
        }
    }
}
