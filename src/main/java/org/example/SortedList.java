package org.example;

public class SortedList implements HashChainCollection {
    private Link first;
    private int numOfElements;

    public SortedList() {
        first = null;
        numOfElements = 0;
    }

    public void insert(int key) {
        Link theLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.getKey()) {
            previous = current;
            current = current.next;
        }

        if (previous == null) first = theLink;
        else previous.next = theLink;

        theLink.next = current;

        numOfElements++;
    }

    public void delete(int key) {
        Link previous = null;
        Link current = first;

        while (current != null && key != current.getKey()) {
            previous = current;
            current = current.next;
        }

        if (previous == null) first = first.next;
        else previous.next = current.next;

        numOfElements--;
    }

    public boolean find(int key) {
        Link current = first;

        while (current != null && current.getKey() <= key) {
            if (current.getKey() == key) return true;
            current = current.next;
        }

        return false;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");

        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println();
    }

    public Link getFirst() {
        return first;
    }

    public int getNumOfElements() {
        return numOfElements;
    }
}
