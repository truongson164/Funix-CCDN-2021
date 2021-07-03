package mypackage;

public class Myqueue {
    Node front, rear;
    int length =0;

    public boolean isEmpty(){
        return length == 0;
    }

//
    public void enqueue(Node node){

        if(isEmpty()){
            front = node;
        }else {
            rear.setNext(node);
        }
        rear = node;
        length++;
    }

    public void traverse(){
        Node node = front;
        while (node != null) {
            System.out.println(node.getInfo().toString());
            node = node.getNext();
        }
    }


}
