package lab2.shape;

public enum ShapeType {
    CIRCLE(1), CUBE(2), RECTANGLE(3), SQUARE(4), TRIANGLE(5);

    private int type;

    ShapeType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static ShapeType of(int i) {
        if (i < 1 || i > 5) throw new IllegalArgumentException();
        return values()[i-1];
    }
}
