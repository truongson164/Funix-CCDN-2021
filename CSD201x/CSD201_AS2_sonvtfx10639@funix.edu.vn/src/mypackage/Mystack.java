package mypackage;

public class Mystack {
    private int length = 0;
    private Node top = null;

    public int size(){
        return length;
    }

    public void push(Node node){
        node.setNext(top);
        top = node;
        length++;
    }

    public void pop() {
        if(!isEmpty()){
            top = top.getNext();
            length--;
        }

    }

    public Node getTop() {
        return top;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void traverse(){
        Node node = top;
        while (node != null) {
            System.out.println(node.getInfo().toString());
            node = node.getNext();
        }
    }

    public void insertAtBottom(Node node){

        if(size() == 0){
            push(node);
        }
        else {
            Node a = getTop();
            pop();
            insertAtBottom(node);

            push(a);
        }
    }

    public void reverse() {

        if(size() > 0) {

            Node x = getTop();
            pop();
            reverse();

            insertAtBottom(x);
        }
    }
}
