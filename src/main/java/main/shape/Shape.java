package main.shape;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.UUID;

public abstract class Shape {
    protected String id;

    public Shape() {
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
}
