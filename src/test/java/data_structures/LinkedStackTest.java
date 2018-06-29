package data_structures;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertThrows;

public class LinkedStackTest {

    Stack<Integer> linkedStack;

    @BeforeMethod
    public void setUp() {
        linkedStack = new LinkedStack<>();
    }

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            linkedStack.push(i + 1);
        }
        assertEquals(linkedStack.size(), 10);
        assertFalse(linkedStack.isEmpty());
        assertEquals(linkedStack.pop().intValue(), 10);
        assertEquals(linkedStack.pop().intValue(), 9);
    }

    @Test
    public void testException() {
        assertThrows(IndexOutOfBoundsException.class, () -> linkedStack.pop());
    }
}