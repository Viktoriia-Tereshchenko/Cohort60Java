package homework_21;

/*
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.

 */

public class Task01 {
    public static void main(String[] args) {

        Table table = new Table(50, 100, 75, "white", "МДФ", "письменный");
        table.info();
        table.findArea();

        System.out.println("\n================\n");

        Lamp lamp = new Lamp();
        lamp.use();
        lamp.color = "white";
        lamp.statusOn = true;
        lamp.maxPower = 11;
        lamp.info();

        System.out.println("\n================\n");

        Chair chair = new Chair(42, 57, 95, "braun", "пластик", "дерево", false);
        chair.hasArmrests();
        chair.info();
    }
}
