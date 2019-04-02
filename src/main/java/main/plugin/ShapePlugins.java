package main.plugin;

import main.shape.Shape;
import org.reflections.Reflections;

public class ShapePlugins {

    private static boolean enable = false;
    private static ShapePlugin ourInstance;

    static {
        Reflections reflections = new Reflections("main.plugin");
        Class<? extends ShapePlugin> aClass = reflections.getSubTypesOf(ShapePlugin.class)
                .stream()
                .findFirst()
                .orElse(DefaultShapePlugin.class);
        try {
            ourInstance = aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            ourInstance = new DefaultShapePlugin();
        }
    }

    private ShapePlugins() {
    }

    public static ShapePlugin shapeHandler() {
        return ourInstance;
    }

    public static boolean isEnable() {
        return enable;
    }

    public static void setEnable(boolean enable) {
        ShapePlugins.enable = enable;
    }

    private static class DefaultShapePlugin implements ShapePlugin {
        @Override
        public void handle(Shape shape) {

        }
    }
}
