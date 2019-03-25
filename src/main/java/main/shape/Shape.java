package main.shape;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.UUID;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "shapeType", visible = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Circle.class, name = "CIRCLE"),
        @JsonSubTypes.Type(value = Cube.class, name = "CUBE"),
        @JsonSubTypes.Type(value = Parallelogram.class, name = "PARALLELOGRAM"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "RECTANGLE"),
        @JsonSubTypes.Type(value = Square.class, name = "SQUARE"),
        @JsonSubTypes.Type(value = Triangle.class, name = "TRIANGLE")
})
public abstract class Shape {
    protected ShapeType shapeType;
    protected String id;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
        this.id = UUID.randomUUID().toString();
    }

    @JsonIgnore
    public abstract ShapeData getShapeData();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
