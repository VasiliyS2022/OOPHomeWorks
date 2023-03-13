import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Тоша"));
        animals.add(new Dog("Бимон"));
        animals.add(new Eagle("Эш"));
        animals.add(new Duck("Дональд"));
        animals.add(new Dolphin("Снупи"));
        animals.add(new Whale("Оушен"));

        for (Animal a: animals) a.toGo();
        System.out.println();

        for (Animal a: animals) a.fly();
        System.out.println();

        for (Animal a: animals) a.swim();
        System.out.println();
    }
}