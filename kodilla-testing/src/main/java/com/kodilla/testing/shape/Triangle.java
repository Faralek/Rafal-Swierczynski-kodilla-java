package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private double field;

    public Triangle(double field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.field, field) != 0) return false;
        return shapeName != null ? shapeName.equals(triangle.shapeName) : triangle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        shapeName = "triangle";
        return shapeName;
    }

    @Override
    public double getField() {
        return field;
    }
}
