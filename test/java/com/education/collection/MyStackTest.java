package com.education.collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class MyStackTest {

    @Test
    void push() {
        MyStack stack = new MyStack();
        stack.push(5);
        Assertions.assertEquals(1, stack.size());
        Assertions.assertEquals(5, stack.peek());

    }

    @Test
    void pop() {
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(1, stack.size());
    }

    @Test
    public void testPeekEmpty() {
        MyStack testStack = new MyStack();
        Assertions.assertEquals(null, testStack.peek());
    }

    @Test
    public void testPeekNotEmpty() {
        MyStack testStack = new MyStack();
        testStack.push(5);
        Assertions.assertEquals(5, testStack.peek());
    }

    @Test
    void empty() {
        MyStack stack = new MyStack();
        Assertions.assertTrue(stack.empty());
    }
}