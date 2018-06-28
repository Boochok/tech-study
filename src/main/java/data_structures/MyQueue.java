package data_structures;

import java.util.Iterator;

public class MyQueue<T> {

    Node<T> head;
    Node<T> tail;
    int nodeCounter;

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(T o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public boolean add(T element) {
        Node<T> newbie;
        if (head == null) {
            newbie = new Node<>(element, head);
            head = newbie;
            head.prev = newbie;
            tail = newbie;
            nodeCounter++;
        } else {
            newbie = new Node<>(element, tail);
//            newbie = new Node<>(element, tail);
            tail = newbie;
        }
        return false;
    }

    public T remove() {
        T element = head.element;
        head = head.prev;
        return element;
    }

    public T poll() {
        return null;
    }

    public T element() {
        return null;
    }

    public T peek() {
        return null;
    }

    private class Node<T> {

        T element;
        Node<T> prev;

        public Node(T element, Node<T> prev) {
            this.element = element;
            this.prev = prev;
        }
    }
}
