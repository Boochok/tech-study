package data_structures;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyQueueTest {

    MyQueue<Integer> queue = new MyQueue<>();

    @Test
    public void test() {
        assertTrue(queue.isEmpty());
        for (int i = 0; i < 15; i++) {
            queue.add(i);
        }
        assertEquals(queue.size(), 15);
        assertFalse(queue.isEmpty());
        assertEquals(queue.remove().intValue(), 0);
        assertEquals(queue.remove().intValue(), 1);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testException() {
        for (int i = 0; i < 15; i++) {
            queue.remove();
        }
    }
}