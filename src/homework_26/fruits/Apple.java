package homework_26.fruits;

public class Apple extends Fruit{

    private String variety;

    public Apple(String name, double weight, String color) {
        super(name, weight, color);
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
