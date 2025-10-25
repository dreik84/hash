package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataItemTest {

    @Test
    void getKey() {
        DataItem item = new DataItem(5);

        int expected = 5;
        int actual = item.getKey();

        assertEquals(expected, actual);
    }
}