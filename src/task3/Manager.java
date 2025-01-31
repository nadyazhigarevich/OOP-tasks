package task3;

import java.io.FilenameFilter;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("Manager is working");
    }
}