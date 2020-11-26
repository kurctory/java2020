package com.education.hash;

import java.util.ArrayList;

public class HashTable<K, V> {

    static class KeyValueObj<K, V> {
        K key;
        V value;

        public KeyValueObj(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<KeyValueObj<K , V>> table;
    int capacity;

    public HashTable() {
        table = new ArrayList<KeyValueObj<K, V>>(10);
        for (int i = 0; i < 10; i++) {
            table.add(null);
        }
        capacity = 0;
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % table.size();
        while (table.get(hash) != null ) {
            hash++;
            hash %= table.size();
        }
        table.set(hash, new KeyValueObj<>(key, value));
        capacity++;
    }

    public boolean contains(K key) {
        int cursor = key.hashCode() % table.size();
        int prev_index = cursor - 1;
        while (!table.get(cursor).key.equals(key) && cursor != prev_index) {
            cursor++;
            cursor %= table.size();
        }

        return table.get(cursor).key.equals(key) || cursor != prev_index;
    }
    public V get(K key) throws Exception {
        if (!contains(key)) {
            throw new Exception("obj not found");
        }

        int cursor = key.hashCode() % table.size();
        int prev_index = cursor - 1;
        while (!table.get(cursor).key.equals(key) && cursor != prev_index) {
            cursor++;
            cursor %= table.size();
        }

        return table.get(cursor).value;
    }
    public void remove (K key) throws Exception{
        if (!contains(key)) {
            throw new Exception("obj not found");
        }

        int cursor = key.hashCode() % table.size();
        int prev_index = cursor - 1;
        while (!table.get(cursor).key.equals(key) && cursor != prev_index) {
            cursor++;
            cursor %= table.size();
        }
        table.set(cursor, null);
        capacity--;
    }



}
