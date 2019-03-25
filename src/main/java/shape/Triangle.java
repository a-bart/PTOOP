package shape;

public class Triangle implements Shape {

    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide < thirdSide
                || firstSide + thirdSide < secondSide
                || secondSide + thirdSide < firstSide) {
            throw new IllegalArgumentException();
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }
}
