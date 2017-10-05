package day15.linkedlist;

import util.Node;

/**
 *
 * @author Shashi Bhushan
 */
public class LinkedList {
    Node head;
    int size;

    public LinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    // Methods

    // get
    public int get(int index) {
        if(index <= 0 || this.size < index) {
            return -1;
        }

        Node current = this.head;
        while(index-- > 1) {
            current = current.getNext();
        }

        return current.getData();
    }

    // add
    public void add(int data) {
        Node current = this.head;

        while(current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node(data));
        this.size++;
    }

    // size
    public int size() {
        return this.size;
    }

    // isEmpty
    public boolean isEmpty() {
        return this.head == null;
    }

    // remove From the Back of the List
    public void remove() {
        Node current = this.head;

        while(current != null && current.getNext() != null && current.getNext().getNext() != null) {
            current = current.getNext();
        }

        current.setNext(null);
        size--;
    }
}
