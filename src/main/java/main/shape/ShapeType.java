package main.shape;

public enum ShapeType {
    CIRCLE(1), CUBE(2), RECTANGLE(3), SQUARE(4), TRIANGLE(5), PARALLELOGRAM(6);

    private int type;

    ShapeType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static ShapeType of(int i) throws Exception {
        if (i < 1 || i > values().length) throw new Exception();
        return values()[i - 1];
    }
}
