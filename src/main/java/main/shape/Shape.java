package main.shape;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Objects;
import java.util.UUID;

public abstract class Shape {
    protected int checksum;
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

    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(id, shape.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
