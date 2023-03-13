public class Eagle extends Animal {
    public Eagle(String name, String color) {
        super(name, color,4);
    }

    public Eagle(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Eeeaw!");
    }

    @Override
    public void toGo() {}

    @Override
    public void swim() {}
}