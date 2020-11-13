package com.education.collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MyListTest {

    @Test
    void isEmpty() {
        MyList list = new MyList(5);
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    void add() {
        MyList list = new MyList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertEquals(list.get(2), 3);
    }

    @Test
    void remove() {
    }

    @Test
    void testContains() {
        MyList list = new MyList(2);
        list.add(0, 1);
        list.add(1, 2);
        Assertions.assertTrue(list.contains(1));
    }


    @Test
    void get() {
        MyList list = new MyList(2);
        list.add(0, 1);
        list.add(1, 2);
        Assertions.assertEquals(2, list.get(1));
    }

    @Test
    void testAdd() {
        MyList list = new MyList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3, "sss");
        Assertions.assertEquals(list.get(3), "sss");
    }

    @Test
    void testRemove() {
        MyList list = new MyList(2);
        list.add(0, 1);
        list.add(1, 2);
        list.remove(1);
        Assertions.assertFalse(list.contains(2));
    }
}