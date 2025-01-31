package task4;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Bird();
        animals[2] = new Fish();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}