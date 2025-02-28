package homework_24;

public class TestHW24 {
    public static void main(String[] args) {

        System.out.println("=============' + '==============");
        System.out.println(Calculator.add(5,7));
        System.out.println(Calculator.add(1.2,7));
        System.out.println(Calculator.add(-6.3,7));

        System.out.println("=============' - '==============");
        System.out.println(Calculator.subtract(7.7,9.1));
        System.out.println(Calculator.subtract(-5,2));

        System.out.println("=============' * '==============");
        System.out.println(Calculator.multiply(7,9));
        System.out.println(Calculator.multiply(-1,3.5));

        System.out.println("=============' / '==============");
        System.out.println(Calculator.divide(8,2));
        System.out.println(Calculator.divide(0,2));
        System.out.println(Calculator.divide(8,0));

        System.out.println("=============' Dog '==============");

        Dog dog = new Dog("Jeck", 45);
        System.out.println("name: " + dog.getName());
        System.out.println("firstJumpHeight: " + dog.getFirstJumpHeight());
        System.out.println("currentJumpHeight: " + dog.getCurrentJumpHeight());

        dog.jump();
        dog.train();
        //System.out.println("firstJumpHeight: " + dog.getFirstJumpHeight());
        //System.out.println("currentJumpHeight: " + dog.getCurrentJumpHeight());

        dog.jumpBarrier(210);
        dog.jumpBarrier(20);
        dog.train();
        dog.train();

    }
}
