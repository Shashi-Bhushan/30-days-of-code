package util;

/**
 * @author Shashi Bhushan
 */
public class Node {
    // Properties
    private Node next;
    private int data;

    // Constructor
    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node nextNode) {
        this(data);
        this.next = nextNode;
    }

    // Getter
    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    // Setter
    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }
}
