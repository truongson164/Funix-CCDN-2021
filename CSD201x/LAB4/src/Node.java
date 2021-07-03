public class Node {
    private Person info;
    private Node next;

    Node(Person x, Node p) {
        info=x;
        next=p;
    }

    Node(Person x) {this(x,null);}

    public void setNext(Node next) {
        this.next = next;
    }

    public Person getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }

    public void setInfo(Person info) {
        this.info = info;
    }
}
