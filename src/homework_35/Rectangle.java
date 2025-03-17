package homework_35;

import lesson_35.equals.Employee;

import java.util.Objects;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;

        return Double.compare(length, rectangle.length) == 0 &&
                Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) return;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) return;
        this.width = width;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Прямоугольник [длина=");
        sb.append(length).append(", ширина=").append(width).append("]");

        return sb.toString();
    }
}
