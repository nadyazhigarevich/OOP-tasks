package task1;

public class Car {
    private String make;
    private String model;
    private String name;

    public Car(String make, String model, String name) {
        this.make = make;
        this.model = model;
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nName: " + this.name);
    }
}
