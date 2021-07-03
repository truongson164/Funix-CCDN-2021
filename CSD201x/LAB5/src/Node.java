public class Node {
    private int info;
    private Node next;

    Node(int  x, Node p) {info=x;next=p;}

    public Node getNext() {
        return next;
    }

    public int getInfo() {
        return info;
    }
}
