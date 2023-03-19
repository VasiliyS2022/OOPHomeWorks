package PaperAnimals;

import Homework2.Animal;
import Homework2.Flyable;

public class Eagle extends Animal implements Flyable {
    public Eagle(String name, String color) {
        super(name, color,2);
    }

    public Eagle(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Eeeaw!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 80;
    }
}