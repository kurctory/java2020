package com.education.collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.NoSuchElementException;


class mystackTest {

    @Test
    void push() {
        mystack stack = new mystack();
        stack.push(5);
        Assertions.assertEquals(1, stack.size());
        Assertions.assertEquals(5, stack.peek());

    }

    @Test
    void pop() {
        mystack stack = new mystack();
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(1, stack.size());
    }

    @Test
    public void testPeekEmpty() {
        mystack testStack = new mystack();
        Assertions.assertThrows(NoSuchElementException.class, () -> testStack.peek());
    }
    @Test
    public void testPeekNotEmpty() {
        mystack testStack = new mystack();
        testStack.push(5);
        Assertions.assertEquals(5, testStack.peek());
    }

    @Test
    void empty() {
        mystack stack = new mystack();
        Assertions.assertTrue(stack.empty());
    }
}