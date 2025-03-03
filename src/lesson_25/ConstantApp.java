package lesson_25;

public class ConstantApp {
    public static void main(String[] args) {

        // Невозможно изменить значения константы
        //ConstantDemo.PI = 555;

        System.out.println(ConstantDemo.PI);
        System.out.println(ConstantDemo.doublePiSqrt());

//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        String result = "Java" + "fun!";

        StringBuilder sb = new StringBuilder();
        // TODO показать на следующей лекции

    }
}
