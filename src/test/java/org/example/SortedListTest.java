package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SortedListTest {

    @Test
    void testInsertFindDeleteLogic() {
        SortedList list = new SortedList();
        int key = 5;

        assertFalse(list.find(key));

        list.insert(key);

        assertTrue(list.find(key));

        list.delete(key);

        assertFalse(list.find(key));
    }

    @Test
    void displayList() {
    }
}