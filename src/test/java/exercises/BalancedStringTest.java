package exercises;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BalancedStringTest {

    @Test
    public void testIsBalanced() {
        assertFalse(BalancedString.isBalanced("()__{.[..[...]..].}..)"));
        assertFalse(BalancedString.isBalanced("(.{.).}"));
        assertFalse(BalancedString.isBalanced(".)__{..[...[....]...]..}.)"));
        assertTrue(BalancedString.isBalanced("(.)__{.[..[...]..].}"));
    }
}