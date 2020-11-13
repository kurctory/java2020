package com.education.collection;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyList implements List {
    private Object listArray[];             // Array holding list elements
    private static final int DEFAULT_SIZE = 10; // Default size
    private int maxSize;                    // Maximum size of list
    private int listSize;                   // Current # of list items
    private int curr;                       // Position of current element

    MyList(int size) {
        maxSize = size;
        listSize = curr = 0;
        listArray = new Object[size];         // Create listArray
    }

    // Create a list with the default capacity
    MyList() { this(DEFAULT_SIZE); }          // Just call the other constructor

    @Override
    public int size() {
        return 0;
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
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (listSize >= maxSize) return false;
        listArray[listSize++] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {

    }

    @Override
    public void sort(Comparator c) {

    }

    @Override
    public void clear() {
        listSize = curr = 0;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index > maxSize) return null;
        return listArray[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (listSize >= maxSize) System.out.print("Invalid list size");
        else {
            for (int i = listSize; i > index; i--)  // Shift elements up
                listArray[i] = listArray[i - 1];   //   to make room
            listArray[index] = element;
            listSize++;                        // Increment list size
        }
    }

    @Override
    public Object remove(int index) {
        if (index >= maxSize || index < 0){
            System.out.print("Invalid list size or index");
            return listArray;
        }
        else {
            for (int i = index; i < listSize-1; i++)  // Shift elements up
                listArray[i] = listArray[i + 1];   //   to make room
            listSize--;                        // Increment list size
        }
        return listArray;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
