package data_structures;


public class MyStack<T> {

    private Object[] elements;
    private int currentElement;

    public MyStack() {
        elements = new Object[10];
    }

    public void push(T element) {
        if(currentElement == (int)(elements.length * 0.75)) {
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
    public T pop() {
        return (T) elements[--currentElement];
    }

    public boolean isEmpty() {
        return currentElement == 0;
    }

    public int length() {
        return currentElement;
    }
}
