package org.example;

// Реализация хеш-таблицы с использованием метода цепочек
public class HashChain {
    private SortedList[] hashArray;
    private int arraySize;
    private int numOfElements;

    public HashChain(int size) {
        arraySize = size;
        hashArray = new SortedList[arraySize];
        numOfElements = 0;

        for (int i = 0; i < arraySize; i++) {
            hashArray[i] = new SortedList();
        }
    }

    public void displayTable() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + " ");
            hashArray[i].displayList();
        }
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(Link theLink) {
        if (numOfElements >= arraySize) rehash();

        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(key);
        numOfElements++;
    }

    public void delete(int key) {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
        numOfElements--;
    }

    public boolean find(int key) {
        int hashVal = hashFunc(key);
        return hashArray[hashVal].find(key);
    }

    public void rehash() {
        SortedList[] oldHashArray = hashArray;
        arraySize *= 2;
        hashArray = new SortedList[arraySize];


        for (int i = 0; i < hashArray.length; i++) {
            hashArray[i] = new SortedList();
        }

        for (int j = 0; j < oldHashArray.length; j++) {
            if (oldHashArray[j].getFirst() != null) {
                Link cur = oldHashArray[j].getFirst();

                while (cur != null) {
                    insert(new Link(cur.getKey()));
                    cur = cur.next;
                }
            }
        }
    }

    public int getArraySize() {
        return arraySize;
    }
}
