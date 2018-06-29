package data_structures;

public class QueueOnTwoStacks<T> {

    private Stack<T> stackIn;
    private Stack<T> stackOut;

    public QueueOnTwoStacks(Stack<T> stackIn, Stack<T> stackOut) {
        this.stackIn = stackIn;
        this.stackOut = stackOut;
    }

    public void add(T element) {
        stackIn.push(element);
    }
    public T remove() {
        if(stackOut.isEmpty()) {
            while (!stackIn.isEmpty())
                stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }

    public int size() {
        return stackIn.size() + stackOut.size();
    }

    public boolean isEmpty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}
