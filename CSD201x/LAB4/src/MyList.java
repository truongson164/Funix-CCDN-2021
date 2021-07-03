public class MyList {
    private Node head,tail;
    private int length;

    MyList() {head=tail=null;}

    void clear() {head=tail=null;}

    boolean isEmpty() {return(head==null);}


    // Hàm thêm 1 người vào đuôi danh sách móc nối
    void add(Person x) {
        Node node = new Node(x);
        if (isEmpty()) {
            head = tail = node;
            length++;
        } else {
            tail.setNext(node);
            tail = node;
            length++;
        }
    }

    // Hàm thêm nhiều người vào danh sách móc nối, thông tin ( tên và tuổi) của mọi người được lưu trong 2 mảng a và b
    void addMany(String [] a, int [] b) {
        for (int i=0; i <a.length; i++){
            Person person = new Person(a[i], b[i]);
            add(person);
        }
    }

    // Hàm duyệt danh sách móc nối
    void traverse() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getInfo().toString());
            node = node.getNext();
        }
    }

    // Hàmsắp xếp theo tên
    void sortByName() {


        if (length > 1){
            Node i = head;
            while (i.getNext() != null) {
                Node node = head;
                while (node.getNext() != null ){
                    String a = node.getInfo().getName();
                    String b = node.getNext().getInfo().getName();
                    if (a.compareTo(b) > 0){
                        Person temp = node.getInfo();
                        node.setInfo(node.getNext().getInfo());
                        node.getNext().setInfo(temp);
                    }
                    node = node.getNext();
                }
                i = i.getNext();
            }

        }

    }
}
