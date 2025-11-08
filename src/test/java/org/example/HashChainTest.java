package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashChainTest {

    @Test
    void testHashFunc() {
        HashChain hashChain = new HashChain(10);
        int key = 15;

        int expected = 5;
        int actual = hashChain.hashFunc(key);

        assertEquals(expected, actual);
    }

    @Test
    void testInsertFindDeleteLogic() {
        HashChain hashChain = new HashChain(10);
        int key = 15;
        int wrongKey = 16;
        Link link = new Link(key);
        hashChain.insert(link);

        assertTrue(hashChain.find(key));
        assertFalse(hashChain.find(wrongKey));

        hashChain.delete(key);

        assertFalse(hashChain.find(key));
    }

    @Test
    void testRehash() {
        HashChain hashChain = new HashChain(5);

        hashChain.insert(new Link(1));
        hashChain.insert(new Link(2));
        hashChain.insert(new Link(3));
        hashChain.insert(new Link(4));
        hashChain.insert(new Link(5));

        assertEquals(5, hashChain.getArraySize());

        hashChain.insert(new Link(6));

        assertEquals(10, hashChain.getArraySize());
    }
}