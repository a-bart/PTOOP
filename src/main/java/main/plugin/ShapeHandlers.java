package main.plugin;

import main.shape.Shape;
import org.reflections.Reflections;

public class ShapeHandlers {

    private static boolean enable = false;
    private static ShapeHandler ourInstance;

    static {
        Reflections reflections = new Reflections("main.plugin");
        Class<? extends ShapeHandler> aClass = reflections.getSubTypesOf(ShapeHandler.class)
                .stream()
                .findFirst()
                .orElse(DefaultShapeHandler.class);
        try {
            ourInstance = aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            ourInstance = new DefaultShapeHandler();
        }
    }

    private ShapeHandlers() {
    }

    public static ShapeHandler shapeHandler() {
        return ourInstance;
    }

    public static boolean isEnable() {
        return enable;
    }

    public static void setEnable(boolean enable) {
        ShapeHandlers.enable = enable;
    }

    private static class DefaultShapeHandler implements ShapeHandler {
        @Override
        public void handle(Shape shape) {

        }
    }
}
