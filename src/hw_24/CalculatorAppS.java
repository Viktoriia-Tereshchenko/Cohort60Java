package hw_24;

// Версия ДЗ 24 Сергея (учителя)

public class CalculatorAppS {
    public static void main(String[] args) {

        int x1 = 10;
        int x2 = 5;
        int result;
        result = x1 / x2;

        System.out.println("10 / 5: " + result);
        //System.out.println("10 / 0: " + (x1 / 0));

        //result = CalculatorS.divide(x1, 0);
        System.out.println("result calc: " + result);

        double d1 = 10.0;
        double resultD = d1 / 0;

        System.out.println("10.0 / 0.0: " + resultD);

        // Infinity - бесконечность
        // NaN - Значение не определено (не является числом)
        // В типе данных double делить на 0 можно, результатом будет Infinity

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println(inf1 == inf2); // true
        System.out.println(inf1 > inf2); // true

        System.out.println(10.0 / 10.0);
        double res2 = inf1 / inf2;
        System.out.println("inf1 / inf2: " + res2);

        System.out.println("inf1 - inf2: " + (inf1 - inf2));
        System.out.println("inf1 + 10: " + (inf1 + 10));

        System.out.println("inf1 * (-1): " + (inf1 * (-1)));

        System.out.println(inf1 - 150000000);

        // Сравнение на равенство значения с бесконечностью
        System.out.println(inf1 == Double.POSITIVE_INFINITY);

        int x = 10;
        double dVar = 10;

        int res = CalculatorS.add(10,5);
        double res1 = CalculatorS.add(1.00, 5.0);

        System.out.println("\n======================");
        System.out.println("int: " + res);
        System.out.println("double: " + res1);
    }
}
