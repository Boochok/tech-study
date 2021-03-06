package data_structures;

/**
 * Linked, double-site, cyclic list
 */
public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T element) {
        Node<T> newbie;
        if (head == null && tail == null) {
            newbie = new Node<>(element);
            head = newbie;
            tail = newbie;
            newbie.prev = newbie;
            newbie.next = newbie;
        } else {
            newbie = new Node<>(element, tail, head);
            tail.next = newbie;
            tail = newbie;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }

    public T get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, length()));
        Node<T> currentNode;
        int nodeCount;
        if (index < size / 2) {
            currentNode = head;
            nodeCount = 0;
            while (nodeCount++ != index) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            nodeCount = size;
            while (--nodeCount != index) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode.value;
    }

    public T head() {
        return head.value;
    }

    public T tail() {
        return tail.value;
    }

    public T delete(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, length()));
        Node<T> currentNode;
        int nodeCount;
        if (index < size / 2) {
            currentNode = head;
            nodeCount = 0;
            while (nodeCount++ != index) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            nodeCount = size;
            while (--nodeCount != index) {
                currentNode = currentNode.prev;
            }
        }
        T deletedValue = currentNode.value;
        currentNode.next.prev = currentNode.prev;
        currentNode.prev.next = currentNode.next;
        if (index == 0)
            head = currentNode.next;
        if (index == size - 1)
            tail = currentNode.prev;
        size--;
        return deletedValue;
    }

    public int length() {
        return size;
    }

    private class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
