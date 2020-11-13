package com.education.collection;
import java.util.NoSuchElementException;
import java.util.Stack;


public class mystack extends Stack{
    private MyList stack;

    public mystack() {
        stack = new MyList();
    }

    @Override
    public Object push(Object item) {
        stack.add(stack.size(), item);
        return stack.get(stack.size());
    }

    @Override
    public Object pop() {
        if (this.empty()) {
            return null;
        } else {
            int index = stack.size() - 1;
            return stack.remove(index);
        }
    }

    @Override
    public Object peek() {
        if (this.empty()){
            return null;
        } else {
            int index = stack.size() - 1;
            Object data = stack.get(index);
            return data;
        }
    }

    @Override
    public boolean empty() {
        return (stack.isEmpty());
    }

    @Override
    public int search(Object o) {
        throw new UnsupportedOperationException("This operation is not supported");
    }
}
