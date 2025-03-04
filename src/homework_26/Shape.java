package homework_26;

public class Shape {

    protected String name;
    protected String color;


    public Shape() {
    }

//    public Shape(String name) {
//        this.name = name;
//    }

    public void displayInfo() {
        System.out.println("Название фигуры: " + name + (color != null ? ", цвет фигуры: " + color : ""));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
