package lab1.shape;

public class Cube implements Shape {

    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideLength=" + sideLength +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
