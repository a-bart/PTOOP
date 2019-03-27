package main.reader;

import org.reflections.Reflections;

import java.util.*;
import java.util.stream.Collectors;

public class ShapeReaderProvider {

    private static List<ShapeReader> shapeReaders;

    static {
        Reflections reflections = new Reflections("");
        shapeReaders = reflections.getSubTypesOf(ShapeReader.class)
                .stream()
                .map(aClass -> {
                    try {
                        return (ShapeReader) Class.forName(aClass.getName()).newInstance();
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                        System.out.println("Error during load class: " + aClass.getName());
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(ShapeReader::shapeName))
                .collect(Collectors.toList());

    }

    public static ShapeReader reader(int number) {
        if (number < 0 || number >= shapeReaders.size()) throw new IllegalArgumentException();
        return shapeReaders.get(number);
    }

    public static List<String> readers() {
        return shapeReaders.stream()
                .map(ShapeReader::shapeName)
                .collect(Collectors.toList());
    }
}
