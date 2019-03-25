package lab1.shape;

public class Parallelogram implements Shape {

    private int sideA;
    private int sideB;
    private int alpha;

    public Parallelogram(int sideA, int sideB, int alpha) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.alpha = alpha;
    }

    @Override
    public void draw() {
        System.out.println("Parallelogram{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", alpha=" + alpha +
                '}');
    }
}
