package homework_30.triathletes;

public class Triathlete implements Swimmer, Runner {

    @Override
    public void run() {
        System.out.println("Спортсмен бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Спортсмен плывет!");
    }
}
