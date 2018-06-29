package data_structures;

public class MyQueue<T> {

    Node<T> head;
    Node<T> tail;
    int nodeCounter;

    public int size() {
        return nodeCounter;
    }

    public boolean isEmpty() {
        return nodeCounter == 0;
    }

    public void add(T element) {
        Node<T> newbie =  new Node<>(element, null);
        if (head == null) {
            head = newbie;
            tail = newbie;
        } else {
            tail.next = newbie;
            tail = newbie;
        }
        nodeCounter++;
    }

    public T remove() {
        T element = head.element;
        head = head.next;
        nodeCounter--;
        return element;
    }

    private class Node<T> {

        T element;
        Node<T> next;

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }
}
