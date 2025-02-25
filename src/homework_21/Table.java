package homework_21;

public class Table {

    int width;
    int length;
    int height;
    String color;
    String material;
    String type;  // обеденный, письменный, журнальный...

    public Table(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Table(int width, int length, int height, String color, String material, String type) {

        this(width, length, height);
        this.color = color;
        this.material = material;
        this.type = type;
    }

    public void findArea() {
        double area;
        area = (double) width * length / 10000;
        System.out.println("Площадь столешницы (м^2): " + area);
    }

    public void info() {
        System.out.printf("Стол размером %dx%dx%d, цвет - %s, материал - %s, тип - %s\n", width, length, height, color, material, type);
    }

}
