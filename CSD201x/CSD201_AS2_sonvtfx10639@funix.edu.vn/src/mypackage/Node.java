package mypackage;

public class Node {
    private Product info;

    private Node next;

//1. Constructor method
    public Node(){
        info = null;
        next = null;
    }

    public Node(Product x) {
        info = x;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Product getInfo() {
        return info;
    }

    public void setInfo(Product info) {
        this.info = info;
    }
}

