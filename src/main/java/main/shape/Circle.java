package main.shape;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {

    private int radius;

    public Circle() {
        super(ShapeType.CIRCLE);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this();
        this.radius = radius;
    }

    @Override
    @JsonIgnore
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    @JsonIgnore
    public ShapeData getShapeData() {
        return new ShapeData(toString());
    }
}
