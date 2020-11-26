package com.education.hash;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap <K, V> implements Map<K, V> {
    HashTable<K, V> hashTable;

    public HashMap() {
        hashTable = new HashTable<>();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return hashTable.capacity == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return hashTable.contains((K)key);
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public V get(Object key) {
        try {
            return hashTable.get((K)key);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public V put(K key, V value) {
        hashTable.put(key, value);
        return value;
    }

    @Override
    public V remove(Object key) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("This operation is not supported");
    }
}
