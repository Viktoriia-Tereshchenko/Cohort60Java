package homework_26;

public class Fruit {

    protected String name;
    protected double weight;
    protected String color;

    public Fruit(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String toString() {
        String result = String.format("Название фрукта: %s, цвет: %s, вес: %.2f г", name, color, weight);
        return result;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}