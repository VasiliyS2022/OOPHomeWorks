package PaperAnimals;

import Homework2.Animal;
import Homework2.Flyable;
import Homework2.Speakable;

public class Parrot extends Animal implements Speakable, Flyable {
    public Parrot(String name, String color) {
        super(name, color,2);
    }

    public Parrot(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.printf("%s хороший%n", this.getName());
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 40;
    }
}