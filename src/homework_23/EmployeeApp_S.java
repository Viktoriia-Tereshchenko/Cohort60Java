package homework_23;

public class EmployeeApp_S {
    public static void main(String[] args) {

        Employee employee = new Employee("Max", 25, 5000.00);
        employee.info();
        System.out.println(employee.getName());


        Employee peter= new Employee("Peter", 45, 1000.00);

        System.out.println(peter.getSalary());
        peter.setSalary(1050);
        peter.info();


    }
}
