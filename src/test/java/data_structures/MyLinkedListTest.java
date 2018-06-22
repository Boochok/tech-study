package data_structures;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyLinkedListTest {

    private MyLinkedList<String> list;

    @BeforeMethod
    public void setUp() {
        list = new MyLinkedList<>();
        list.add("let's");
        list.add("sketch out");
        list.add("several");
        list.add("words");
    }

    @Test
    public void testAdd() {
        list.add("flickering");
        list.add("gleaming");
        assertEquals(list.length(), 6);
        assertEquals(list.get(list.length()-2), "flickering");
    }

    @Test
    public void testGet() {
        assertEquals(list.get(0), "let's");
        assertEquals(list.get(1), "sketch out");
        assertEquals(list.get(2), "several");
        assertEquals(list.get(3), "words");
        assertThrows(IndexOutOfBoundsException.class, ()->list.get(19));
        assertThrows(IndexOutOfBoundsException.class, ()->list.get(-3));
    }

    @Test
    public void testHead() {
        assertEquals(list.head(), "let's");
    }

    @Test
    public void testTail() {
        assertEquals(list.tail(), "words");
    }

    @Test
    public void testDelete() {
        assertEquals(list.length(), 4);
        assertEquals(list.delete(2), "several");
        assertEquals(list.length(), 3);
        assertEquals(list.delete(0), "let's");
        assertEquals(list.delete(list.length()-1), "words");
        assertEquals(list.length(), 1);

    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testDeleteThrowException() {
        list.delete(15);
        list.delete(-2);
    }

    @Test
    public void testLength() {
        assertEquals(list.length(), 4);
    }
}