package homework_28.people;
/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
*/

public class Task01 {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("\n======Человек=========");
        person.run();

        System.out.println("\n=====Спортсмен-любитель======");
        SportAmateur amateur = new SportAmateur();
        amateur.run();

        System.out.println("\n=====Спортсмен-профи======");
        SportPro profi = new SportPro();
        profi.run();
    }

}
