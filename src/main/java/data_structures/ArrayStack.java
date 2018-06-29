package data_structures;


public class ArrayStack<T> implements Stack<T> {

    private Object[] elements;
    private int currentElement;

    public ArrayStack() {
        elements = new Object[10];
    }

    @Override
    public void push(T element) {
        if (currentElement == (int) (elements.length * 0.75)) {
            copyArray();
        }
        elements[currentElement++] = element;
    }

    private void copyArray() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, currentElement);
        elements = newElements;
    }

    @SuppressWarnings("unchecked cast")
    @Override
    public T pop() {
        return (T) elements[--currentElement];
    }

    @Override
    public boolean isEmpty() {
        return currentElement == 0;
    }

    @Override
    public int size() {
        return currentElement;
    }
}
