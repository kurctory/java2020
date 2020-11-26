package com.education.collection;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyList implements List {
    private Object listArray[];             // Array holding list elements
    private static final int DEFAULT_SIZE = 10; // Default size
    private int maxSize;                    // Maximum size of list
    private int listSize;                   // Current # of list items
    private int curr;                       // Position of current element

    MyList(int maxSize) {
        this.maxSize = maxSize;
        curr = 0;
        listArray = new Object[maxSize];         // Create listArray
        listSize = 0;
    }

    // Create a list with the default capacity
    MyList() {
        this(DEFAULT_SIZE);
    }          // Just call the other constructor

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < listSize; i++) {
            if (listArray[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (listSize >= maxSize) {
            return false;
        }
        listArray[listSize++] = o;
        listSize++;
        return true;
    }

    @Override
    public void clear() {
        listSize = curr = 0;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > maxSize) {
            return null;
        }
        return listArray[index];
    }

    @Override
    public void add(int index, Object element) {
        if (listSize >= maxSize) {
            System.out.print("Invalid list size");
        } else {
            for (int i = listSize; i > index; i--)  // Shift elements up
                listArray[i] = listArray[i - 1];   //   to make room
            listArray[index] = element;
            listSize++;                        // Increment list size
        }
    }

    @Override
    public Object remove(int index) {
        if (index >= maxSize || index < 0) {
            System.out.print("Invalid list size or index");
            return listArray;
        } else {
            for (int i = index; i < listSize - 1; i++)  // Shift elements up
                listArray[i] = listArray[i + 1];   //   to make room
            listSize--;                        // Increment list size
        }
        return listArray;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean removeIf(Predicate filter) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void sort(Comparator c) {
        throw new UnsupportedOperationException("This operation is not supported");
    }


    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Spliterator spliterator() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Stream stream() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Stream parallelStream() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("This operation is not supported");
    }
}
