package data_structures;


public class ArrayStack<T> implements Stack<T> {

    private Object[] elements;
    private int size;

    public ArrayStack() {
        elements = new Object[10];
    }

    @Override
    public void push(T element) {
        if (size == (int) (elements.length * 0.75)) {
            copyArray();
        }
        elements[size++] = element;
    }

    private void copyArray() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    @SuppressWarnings("unchecked cast")
    @Override
    public T pop() {
        return (T) elements[--size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked cast")
    @Override
    public T peek() {
        return (T) elements[size -1];
    }
}
