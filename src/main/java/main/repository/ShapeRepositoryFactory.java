package main.repository;

import main.MainClass;
import main.plugin.ShapePlugin;
import main.plugin.ShapePlugins;
import main.shape.Shape;

import java.util.Collection;
import java.util.List;

public class ShapeRepositoryFactory {
    private static ShapeRepository shapeRepository;

    public static ShapeRepository bsonShapeRepository() {
        if (shapeRepository == null) {
            shapeRepository = new ShapeRepositoryWrapper(MainClass.filepath);
        }
        return shapeRepository;
    }

    private static class ShapeRepositoryWrapper implements ShapeRepository {

        private ShapeRepository shapeRepository;
        private ShapePlugin shapePlugin;


        ShapeRepositoryWrapper(String filepath) {
            shapeRepository = new BsonFileShapeRepositoryImpl(filepath);
            shapePlugin = ShapePlugins.shapeHandler();
        }

        @Override
        public void save(Shape shape) {
            if (ShapePlugins.isEnable())
                shapePlugin.handle(shape);
            shapeRepository.save(shape);
        }

        @Override
        public void saveAll(Collection<Shape> shapes) {
            if (ShapePlugins.isEnable())
                shapes.forEach(shapePlugin::handle);
            shapeRepository.saveAll(shapes);
        }

        @Override
        public void update(Shape shape) {
            if (ShapePlugins.isEnable())
                shapePlugin.handle(shape);
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
