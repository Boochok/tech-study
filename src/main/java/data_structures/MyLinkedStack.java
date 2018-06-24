package data_structures;

public class MyLinkedStack<T> implements Stack<T> {

    private int nodeCounter;
    private Node<T> currentNode;

    @Override
    public void push(T element) {
        Node<T> newbie;
        if (nodeCounter == 0) {
            newbie = new Node<>(element, null);
        } else {
            newbie = new Node<>(element, currentNode);
        }
        currentNode = newbie;
        nodeCounter++;
    }

    @Override
    public T pop() {
        nodeCounter--;
        return currentNode.value;
    }

    @Override
    public boolean isEmpty() {
        return nodeCounter == 0;
    }

    @Override
    public int size() {
        return nodeCounter;
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
