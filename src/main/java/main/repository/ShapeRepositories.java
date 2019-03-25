package main.repository;

import main.MainClass;

public class ShapeRepositories {
    private static BsonFileShapeRepositoryImpl shapeRepository;

    public static ShapeRepository bsonShapeRepository() {
        if (shapeRepository == null) {
            shapeRepository = new BsonFileShapeRepositoryImpl(MainClass.filepath);
        }
        return shapeRepository;
    }
}
