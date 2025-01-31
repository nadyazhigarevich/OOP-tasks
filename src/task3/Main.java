package task3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Artem", 10000);
        Manager manager = new Manager("Nadya", 3000);
        Developer developer = new Developer("Artem", 15000);
        employee.work();
        manager.work();
        developer.work();
    }
}