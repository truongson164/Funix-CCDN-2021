package mypackage;

public class MyList {

    private Node head;
    private Node tail;

//  Constructor method
    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty(){
        return (head == null);
    }

//    Chen vao duoi cua LinkedList
    public void insertToTail(Node x){
        if (isEmpty()) {
            head = tail = x;
        } else {
            tail.setNext(x);
            tail = x;
        }
    }

// Delete element  has value= x
    public void deleteElement(String ID){
        Node node = head;
        Node preNode = new Node();
        while (node != null){
            if (!node.getInfo().getBcode().equals(ID) && node == head){
                preNode = node;
            }
            else if(node.getInfo().getBcode().equals(ID) && node == head) {
                head = head.getNext();
                preNode = node;
            } else if (!node.getInfo().getBcode().equals(ID) && (node != head)) {

                preNode = node;
            } else if (node.getInfo().getBcode().equals(ID) && (node != head)){
                preNode.setNext(node.getNext());
                if (node == tail) {
                    tail = preNode;
                }
            }
            node = node.getNext();
        }
    }

//    Duyet qua cac Node cua LinkedList
    public void traverse(){
        Node node = head;
        while (node != null) {
            System.out.println(node.getInfo().toString());
            node = node.getNext();
        }
    }

    public String toString(){
        Node node = head;
        String string = "";
        while (node != null) {
            string += node.getInfo().toString() + "\n";
            node = node.getNext();
        }
        return string;
    }

//    Tim theo ID
    public String findByID(String ID){
        Node node = head;
        String string ="";
        while (node != null){
            if(node.getInfo().getBcode().equals(ID)) {
                string += node.getInfo().toString() +"\n";
            }
            node = node.getNext();
        }
        if (!string.equals("")) return string;
        return "-1";
    }

//    Sap xep theo ID
    public void quickSortByID (Node start, Node end) {

        if(start == null || start == end )
            return;

        Node prev = partition(start, end);
        quickSortByID(start, prev);

        if (prev != null && prev == start)
            quickSortByID(prev.getNext(), end);

        else if (prev != null && prev.getNext() != null)
            quickSortByID(prev.getNext().getNext(), end);

    }

    public Node partition(Node start, Node end){

        if (start == end || start == null || end == null){
            return start;
        }
        Node prev = start;
        Node current = start;
        String pivot = end.getInfo().getBcode();

        while (start != end) {
            if (start.getInfo().getBcode().compareTo(pivot) < 0) {
                prev = current;

                Product temp = current.getInfo();
                current.setInfo(start.getInfo());
                start.setInfo(temp);

                current = current.getNext();
            }
            start = start.getNext();
        }
        Product temp = current.getInfo();
        current.setInfo(end.getInfo());
        end.setInfo(temp);
        return prev;
    }

    public String convertToBinary(int i){

        String string = "";
        if(i > 0) {
            string += i % 2 + convertToBinary(i / 2);
        }
        return string;

    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
