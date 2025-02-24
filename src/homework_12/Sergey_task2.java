package homework_12;

public class Sergey_task2 {
    public static void main(String[] args) {

        /*
        Task 2
        Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).
        Вычислите среднюю температуру за неделю и выведите ее на печать.
        P.S. - правильно выберите типы данных
         */
        int t1 = 20;
        int t2 = 18;
        int t3 = 22;
        int t4 = 17;
        int t5 = 23;
        int t6 = 21;
        int t7 = 20;

        int days = 7;

        // Сумма всех чисел, деленная на количество
        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        System.out.println("SumTemp: " + sumTemp);

        //double averageTepm = sumTemp / days; // 141 / 7 = 20 -> 20.0
        double averageTepm = (double) sumTemp / days;  // 141.0 / 7.0 = 20.142857142857142
        System.out.println("Average Tepm: " + averageTepm);


    }
}
