package hw.hw_28.runners;

public class RunnersApp {
    public static void main(String[] args) {

        Human human = new Human();

        AmateurRunner amateur =  new AmateurRunner(15, 10);

        ProfRunner profi = new ProfRunner(25, 5);

        human.run();
        amateur.run();
        profi.run();

        Human[] humans = new Human[3];
        humans[0] = human;
        humans[1] = amateur;
        humans[2] = profi;

        for (int i = 0; i < humans.length; i++) {
            humans[i].run();
        }


    }
}
