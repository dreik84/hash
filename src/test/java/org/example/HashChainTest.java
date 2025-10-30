package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

        assertEquals(link, hashChain.find(key));
        assertNull(hashChain.find(wrongKey));

        hashChain.delete(key);

        assertNull(hashChain.find(key));
    }
}