package shape;

public class Square implements Shape {

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
