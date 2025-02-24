package homework_15;

import java.util.Random;

public class SergeyTask04 {
    public static void main(String[] args) {

        /*
Task 4 * (Опционально)
Используйте оператор switch для решения задачи:
Ваш ребенок принес оценку за контрольную работу по математике.
В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
         */

        Random random = new Random();

        // Ребенок принес из школы 3 оценки (массив 3-х случайных значений от 0 до 12)

        int[] notes = {random.nextInt(13), random.nextInt(13), random.nextInt(13)};

        int note = random.nextInt(13); // 0..12]

        //System.out.println("Оценка:" + note);

        int timeMax = 60;
        int restToday = 45;

        int i = 0;

        while (i < notes.length) {

            note = notes[i];
            System.out.println("Оценка:" + note);

            switch (note) {
                case 12:
                case 11:
                case 10:
                    System.out.println("скажите ребенку, как вы рады");
                    restToday += 60;
                    break;
                case 9:
                case 8:
                case 7:
                    System.out.println("похвалите ребенка");
                    restToday += 45;
                    break;
                case 6:
                case 5:
                case 4:
                    System.out.println("нейтрально отнеситесь");
                    restToday += 15;
                    break;
                case 3:
                    System.out.println("огорчитесь");
                    restToday -= 30;
                    break;
                case 2:
                case 1:
                case 0:
                    System.out.println("запретите телевизор на сегодня");
                    restToday = 0;
                    break;
                default:
                    System.out.println("Стирать оценки в дневнике не хорошо!");
                    System.out.println("Таких оценок не бывает!");
            }

            System.out.println("После оценки " + note + " время просмотра: " + restToday);
            i++;
        }

        System.out.println("Сырое время после всех оценок: " + restToday);

        if (restToday > timeMax) restToday = timeMax;
        if (restToday < 0) restToday = 0;

        System.out.println("На сегодня осталось: " + restToday);



    }
}
