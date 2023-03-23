package paperlist;

public interface GBDeque<T> extends Iterable<T>{
    boolean isEmpty();
    void addFirst(T t);
    void addLast(T t);
    void removeFirst();
    void removeLast();
    T get(int i);
}
