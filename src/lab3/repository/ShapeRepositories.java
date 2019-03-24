package lab3.repository;

public class ShapeRepositories {
    private static BsonFileShapeRepositoryImpl shapeRepository;

    public static ShapeRepository bsonShapeRepository() {
        if (shapeRepository == null) {
            shapeRepository = new BsonFileShapeRepositoryImpl();
        }
        return shapeRepository;
    }
}
