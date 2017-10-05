package day15.linkedlist;

import org.junit.BeforeClass;
import org.junit.Test;
import util.Node;

public class LinkedListTest {
    static Node head;

    @BeforeClass
    public static void setup() {
        Node current = new Node(1);
        current.setNext(new Node(2));
        current.getNext().setNext(new Node(3));
        current.getNext().getNext().setNext(new Node(4));
        current.getNext().getNext().getNext().setNext(new Node(5));

        LinkedListTest.head = current;
    }

    @Test
    public void createLinkedList() {
        LinkedList list = new LinkedList(head, 5);

        assert(list != null);
    }

    @Test
    public void createLinkedList_checkSizeAndHead() {
        LinkedList list = new LinkedList(head, 5);

        assert(list.size() == 5);
    }

    @Test
    public void checkFirstElement() {
        LinkedList list = new LinkedList(head, 5);

        assert(list.get(1) == 1);
    }

    @Test
    public void deleteElement_checkSize() {
        LinkedList list = new LinkedList(head, 5);

        list.remove();
        assert(list.size() == 4);
    }

    @Test
    public void deleteElementTwice_checkSize() {
        LinkedList list = new LinkedList(head, 5);

        list.remove();
        list.remove();
        assert(list.size() == 3);
    }


}
