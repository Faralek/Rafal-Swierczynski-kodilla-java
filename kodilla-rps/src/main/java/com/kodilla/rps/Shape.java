package com.kodilla.rps;

import java.util.Objects;

public class Shape {
    private final String shape;

    public Shape(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape1 = (Shape) o;

        return Objects.equals(shape, shape1.shape);
    }

    @Override
    public int hashCode() {
        return shape != null ? shape.hashCode() : 0;
    }

    @Override
    public String toString() {
        return
                "'" + shape + '\''
                ;
    }
}
