package homework_23;

import java.util.Arrays;

public class TestHW23 {
    public static void main(String[] args) {

        System.out.println("\n==========класс Employee===========\n");
        Employee employee = new Employee("Василий", 40, 3700.50);

        employee.info();

        employee.setAge(-2);
        employee.setAge(41);
        employee.setAge(92);

        employee.setSalary(0);
        employee.setSalary(1320);
        employee.setSalary(3320.57);

        System.out.println("Имя: " + employee.getName());
        System.out.println("Возраст: " + employee.getAge());
        System.out.println("Зарплата: " + employee.getSalary());

        employee.info();


        System.out.println("\n==========класс MagicArrayEncaps===========\n");
        int[] test = {5, 3, 9, 11, -7, 4};
        //int[] test = {};
        //int[] test = null;
        MagicArrayEncaps magic = new MagicArrayEncaps(test);
        //magic.add(-15);
        magic.test();
        System.out.println(magic.toString());

        int[] arrayFromMagic = magic.toArray();
        System.out.println(Arrays.toString(arrayFromMagic));
    }
}
