package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SortedListTest {

    private Link lin;

    @Test
    void testInsertFindDeleteLogic() {
        SortedList list = new SortedList();
        int key = 5;
        Link link = new Link(5);

        assertNull(list.find(key));

        list.insert(link);

        assertEquals(key, list.find(key).getKey());

        list.delete(key);

        assertNull(list.find(key));
    }

    @Test
    void displayList() {
    }
}