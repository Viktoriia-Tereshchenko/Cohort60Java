package hw_30.task1;

public class Triathlete implements Swimmer, Runner {

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "running");
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Triathlete{" +
                "name='" + name + '\'' +
                '}';
    }
}
