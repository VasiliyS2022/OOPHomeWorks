package homework4;

import paperlist.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> integers = new GBLinkedList<>(1);
        integers
                .add(2)
                .add(3)
                .add(4);
        integers.addFirst(5);
        integers.addLast(10);

        System.out.println(integers);
        integers.remove(3);
        System.out.println(integers);
        integers.removeFirst();
        System.out.println(integers);
        integers.removeLast();
        System.out.println(integers);


    }
}