public class MyList {
    private Node head, tail;
    private int length;

    MyList() {
        head=tail=null;
        length = 0;
    }

    boolean isEmpty() {return(head==null);}

    int size() {
        return length;
    }

    void clear() {head=tail=null;}

    // Hàm thêm  một phần tử vào đầu danh sách
    void addHead(int x) {
        if (isEmpty()) {
            Node node = new Node(x);
            head = tail = node;
            length++;
        } else {
            head = new Node(x, head);
            length++;
        }

    }

    // Hàm thêm nhiều phần tử vào đầu danh sách
    void addMany(int [] a) {
        for (int j : a) addHead(j);
    }

    void visit(Node p) {
        System.out.print(p.getInfo() + "  ");
    }

    // Hàm Duyệt danh sách
    void traverse() {
        Node node = head;
        while (node != null) {
            visit(node);
            node = node.getNext();
        }
    }

    // Hàm tìm kiếm phần tử cóa giá trị lớn hơn x, nếu tìm thấy thì hiển thị chỉ số của phần tử ra màn hình, giả sử phần tử đầu tiên có chỉ số là 0;
    void Search(int x) {
        Node node = head;
        int index = 0;
        while (node != null) {
            if (node.getInfo() > x) {
                System.out.println(index);
            }
            node = node.getNext();
            index++;
        }
    }

}
