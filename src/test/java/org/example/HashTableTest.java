package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HashTableTest {

    @Test
    void testInsertFindDeleteLogic() {
        HashTable hashTable = new HashTable(11);
        int key = 15;
        DataItem item = new DataItem(key);
        hashTable.insert(key, item);

        DataItem expected = item;
        DataItem actual = hashTable.find(item.getKey());

        assertEquals(expected, actual);

        hashTable.delete(item.getKey());

        assertNull(hashTable.find(item.getKey()));
    }

    @Test
    void hashFunc() {
        HashTable hashTable = new HashTable(11);
        int key = 15;

        int expected = 15 % 11;
        int actual = hashTable.hashFunc1(key);

        assertEquals(expected, actual);
    }

    @Test
    void displayTable() {
    }
}