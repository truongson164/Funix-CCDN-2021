public class MyStack {
    Node head;

    MyStack() {head=null;}

    boolean isEmpty() {return(head==null);}

    // Hàm đẩy 1 phần tử vào stack
    void push(int x) {
        Node node = new Node(x, head);
        head =  node;
    }
    // Hàm lấy 1 phần tử ra khỏi stack
    int pop() {
        Node node = head;
        if (!isEmpty()) {
            head = head.getNext();
        }
        return node.getInfo();
    }

     void CovertToBinary(int x){
        while (x > 0){
            int r = x % 2;
            push(r);
            x /= 2;
        }
        while(!isEmpty()) {
            System.out.print(pop());
        }


    }
}
