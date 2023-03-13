public class Dolphin extends Animal {
    public Dolphin(String name, String color) {
        super(name, color,0);
    }

    public Dolphin(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Skree!");
    }

    @Override
    public void toGo() {}

    @Override
    public void fly() {}
}