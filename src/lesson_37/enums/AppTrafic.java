package lesson_37.enums;

public class AppTrafic {
    public static void main(String[] args) {

        Colors color = Colors.RED;
        System.out.println("colors = " + color);

        // Получаю массив всех значений enum
        Colors[] colors = Colors.values();

        for (Colors current: Colors.values()) {
            System.out.println(current);
        }

        // Возвращает константу Enum по указанному имени (строке)
        Colors red = Colors.valueOf("RED");

        // Enum безопасно сравнивать оператором == (не обязательно использовать equals())
        System.out.println("color == Colors.RED : " + (color == Colors.RED));

        // У каждой константы есть порядковый номер (начиная с 0)
        System.out.println("color.ordinal() : " + color.ordinal());

        TrafficLight trafficLight = new TrafficLight("SN-001", "Berlin",
                Colors.YELLOW);
        System.out.println(trafficLight);

        Colors newC = Colors.GREEN;
        System.out.println(newC.ordinal());
    }
}
