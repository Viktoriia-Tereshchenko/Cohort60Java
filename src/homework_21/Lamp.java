package homework_21;

public class Lamp {

    String color;
    int maxPower;
    boolean statusOn;

    public Lamp(){
        // материал = null, включена = false, макс.мощность = 0
    }

    public Lamp(String color, boolean statusOn, int maxPower) {
       this.color = color;
       this.statusOn = statusOn;
       this.maxPower = maxPower;
    }

    public void use(){
        if (statusOn) System.out.println("Лампа светит");
        else System.out.println("Лампа выключена");
    }

    public void info() {
        System.out.printf("Цвет лампы - %s, max W - %d, состояние - %s\n", color, maxPower, (statusOn) ? "On" : "Off");
    }
}

