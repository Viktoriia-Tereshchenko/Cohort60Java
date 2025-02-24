package homework_12;

public class Task02 {
    public static void main(String[] args) {

        double temperatureMonday = 2.5;
        double temperatureTuesday = 1.5;
        double temperatureWednesday = 1.7;
        double temperatureThursday = 3.9;
        double temperatureFriday = 5.5;
        double temperatureSaturday = 4.1;
        double temperatureSunday = 3.4;

        double averageTemperature = (temperatureMonday + temperatureTuesday + temperatureWednesday + temperatureThursday + temperatureFriday + temperatureSaturday + temperatureSunday) / 7;
        System.out.printf("Средняя температура за неделю %.1f °C\n", averageTemperature);
    }
}
