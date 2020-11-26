package com.education.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @Test
    void put() {
        String key1 = "hello";
        String value1 = "world";
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put(key1, value1);
        int index = key1.hashCode() % hashTable.table.size();
        assertNotEquals(hashTable.table.get(index), null);
    }

    @Test
    void contains() {
        HashTable<String, String> hashTable = new HashTable<>();
        String key1 = "hello";
        String value1 = "world";
        int index = key1.hashCode() % hashTable.table.size();
        hashTable.table.set(index, new HashTable.KeyValueObj<>(key1, value1));
        assertEquals(hashTable.contains(key1), true);
    }

    @Test
    void get() throws Exception {
        HashTable<String, String> hashTable = new HashTable<>();
        String key1 = "hello";
        String value1 = "world";
        int index = key1.hashCode() % hashTable.table.size();
        hashTable.table.set(index, new HashTable.KeyValueObj<>(key1, value1));
        assertEquals(hashTable.get(key1), value1);
    }

    @Test
    void remove() throws Exception {
        HashTable<String, String> hashTable = new HashTable<>();
        String key1 = "hello";
        String value1 = "world";
        int index = key1.hashCode() % hashTable.table.size();
        hashTable.table.set(index, new HashTable.KeyValueObj<>(key1, value1));
        hashTable.remove(key1);
        assertEquals(hashTable.capacity, -1);
    }
}