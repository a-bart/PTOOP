package main.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import de.undercouch.bson4jackson.BsonFactory;
import main.shape.Shape;
import main.util.ShapeCollection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BsonFileShapeRepositoryImpl implements ShapeRepository {

    private final String file;
    private ObjectMapper objectMapper;

    public BsonFileShapeRepositoryImpl(String filepath) {
        this.file = filepath;
        this.objectMapper = new ObjectMapper(new BsonFactory());
        this.objectMapper.enableDefaultTyping();
        boolean exists = Files.exists(Paths.get(file));
        if (!exists) {
            try {
                Files.createFile(Paths.get(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void save(Shape shape) {
        List<Shape> shapes = getAll();
        shapes.add(shape);
        saveCollection(shapes);
    }

    @Override
    public void saveAll(Collection<Shape> shapes) {
        saveCollection(shapes);
    }

    @Override
    public void update(Shape shape) {
        remove(shape.getId());
        save(shape);
    }

    @Override
    public void remove(String id) {
        List<Shape> shapes = getAll().stream()
                .filter(shape -> !shape.getId().equals(id))
                .collect(Collectors.toList());
        saveCollection(shapes);
    }

    @Override
    public List<Shape> getAll() {
        try {
            InputStream inputStream = Files.newInputStream(Paths.get(file));
            ShapeCollection shapeCollection = objectMapper.readValue(new BsonFactory().createParser(inputStream), ShapeCollection.class);
            return shapeCollection.getShapes();
        } catch (MismatchedInputException exception) {
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private void saveCollection(Collection<Shape> collection) {
        try {
            ShapeCollection shapeCollection = new ShapeCollection(collection);
            OutputStream outputStream = Files.newOutputStream(Paths.get(file));
            objectMapper.writeValue(outputStream, shapeCollection);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
