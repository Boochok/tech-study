package data_structures;

public class LinkedStack<T> implements Stack<T> {

    private int size;
    private Node<T> currentNode;

    @Override
    public void push(T element) {
        Node<T> newbie;
        if (size == 0) {
            newbie = new Node<>(element, null);
        } else {
            newbie = new Node<>(element, currentNode);
        }
        currentNode = newbie;
        size++;
    }

    @Override
    public T pop() {
        if(size == 0)
            throw new IndexOutOfBoundsException("Stack is empty");
        size--;
        T result = currentNode.value;
        currentNode = currentNode.prev;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if(size == 0)
            throw new IndexOutOfBoundsException("Stack is empty");
        return currentNode.value;
    }

    private class Node<T> {

        T value;
        Node<T> prev;

        Node(T value, Node<T> prev){
            this.value = value;
            this.prev = prev;
        }


    }
}
