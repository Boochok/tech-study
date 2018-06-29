package data_structures;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayStackTest {

    Stack<Integer> arrayStack = new ArrayStack<>();

    @Test
    public void test() {
        for (int i = 0; i < 5; i++) {
            arrayStack.push(i + 1);
        }

        assertEquals(arrayStack.size(), 5);
        assertFalse(arrayStack.isEmpty());

        assertEquals(arrayStack.pop().intValue(), 5);
        assertEquals(arrayStack.pop().intValue(), 4);
    }

}