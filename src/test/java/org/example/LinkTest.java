package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkTest {

    @Test
    void testGetKey() {
        Link link = new Link(5);

        int expected = 5;
        int actual = link.getKey();

        assertEquals(expected, actual);
    }
}