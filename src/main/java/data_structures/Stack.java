package data_structures;

public interface Stack<T> {

    void push(T element);

    T pop();

    boolean isEmpty();

    int size();
}
