package homework_21;

public class Chair {

    int width;
    int length;
    int height;
    String color;
    String seatMaterial;
    String legsMaterial;
    boolean armrests;

    public Chair(int width, int length, int height, String color, String seatMaterial, String legsMaterial, boolean armrests) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.seatMaterial = seatMaterial;
        this.legsMaterial = legsMaterial;
        this.armrests = armrests;
    }

    public void hasArmrests() {
        if (armrests) System.out.println("Стул комфортный и имеет подлокотники");
        else System.out.println("Стул без подлокотников");
    }

    public void info() {
        System.out.printf("Стул размером %dx%dx%d, цвет - %s, материал сиденья - %s, материал ножек - %s\n", width, length, height, color, seatMaterial, legsMaterial);
    }
}
