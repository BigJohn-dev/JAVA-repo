package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void emptyStackTest() {
        StackOverflowMethods myStack = new StackOverflowMethods(4);
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void fillEmptyStackTest() {
        StackOverflowMethods myStack = new StackOverflowMethods(4);
        assertTrue(myStack.isEmpty());
        myStack.push("Benz");
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void popFilledStackTest() {
        StackOverflowMethods myStack = new StackOverflowMethods(4);
        assertTrue(myStack.isEmpty());
        myStack.push("Benz");
        myStack.push("BMW");
        assertEquals("BMW", myStack.pop());
    }


}
