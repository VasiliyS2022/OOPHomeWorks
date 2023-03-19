package PaperAnimals;

import Homework2.Human;

public class Doctor extends Human {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Curing animals...");
    }
}