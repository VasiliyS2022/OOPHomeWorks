package Homework2;

public abstract class Human extends Animal implements Speakable {
    public Human(String name) {
        super(name, null, 2);
    }

    @Override
    public void speak() {
        System.out.printf("Hello! My name is %s%n", this.getName());
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getType(), this.getName());
    }

    @Override
    public void hunt() {}

    public abstract void work();
}