package homework_23;
/*
Task 0
Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
*/

public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Геттеры для полей класса
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Сеттеры для полей класса
    public void setAge(int age) {
        if (!(age < 18 || age > 80)) {  // допустимый рабочий возраст в компании от 18 до 80
            this.age = age;
        }
    }

    public void setSalary(double salary) { //
        if (!(salary < 1350)) {   // минимальная з/п 1350
            this.salary = salary;
        }
    }

    // Вывод информации о работнике
    public void info() {
        System.out.printf("Информация о работнике: имя - %s, возраст - %d, зарплата - %.2f.\n", name, age, salary);
    }

}
