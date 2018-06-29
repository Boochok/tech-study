package data_structures;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class QueueOnTwoStacksTest {

    Stack<Integer> arrayStack1 = new ArrayStack<>();
    Stack<Integer> arrayStack2 = new ArrayStack<>();

    Stack<Integer> linkedStack1 = new LinkedStack<>();
    Stack<Integer> linkedStack2 = new LinkedStack<>();

    QueueOnTwoStacks<Integer> queueOnTwoArrayStacks = new QueueOnTwoStacks<>(arrayStack1, arrayStack2);
    QueueOnTwoStacks<Integer> queueOnTwoLinkedStacks = new QueueOnTwoStacks<>(linkedStack1, linkedStack2);

    @Test
    public void testAdd() {
        for (int i = 0; i < 100; i++) {
            queueOnTwoArrayStacks.add(i + 1);
            queueOnTwoLinkedStacks.add(i + 1);
        }
        assertEquals(queueOnTwoArrayStacks.size(), 100);
        assertEquals(queueOnTwoLinkedStacks.size(), 100);
        assertFalse(queueOnTwoArrayStacks.isEmpty());
        assertFalse(queueOnTwoLinkedStacks.isEmpty());
    }

    @Test
    public void testRemove() {
        assertEquals(queueOnTwoArrayStacks.remove().intValue(), 1);
        assertEquals(queueOnTwoArrayStacks.remove().intValue(), 2);
        assertEquals(queueOnTwoLinkedStacks.remove().intValue(), 1);
        assertEquals(queueOnTwoLinkedStacks.remove().intValue(), 2);
    }

}