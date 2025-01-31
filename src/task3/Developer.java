package task3;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("Developer is working");
    }
}