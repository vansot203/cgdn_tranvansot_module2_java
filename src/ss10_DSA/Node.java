package ss10_DSA;

public class Node {
    private Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
