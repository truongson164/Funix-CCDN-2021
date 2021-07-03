public class Node {
    private int info;
    private Node next;

    public Node() {}

    public Node(int x, Node p) {
        info=x;
        next=p;
    }

    public Node(int x) {
        this(x,null);
    }

    public int getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }
}
