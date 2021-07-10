public class SimpleSort {
    int [] a; int n;

    public SimpleSort(int [] b) {
        n = b.length;
        a = new int[n];
        for(int i=0; i<n; i++){
            a[i]= b[i];
        }
    }

    public void display(){
        int i;
        for(i=0;i<n;i++)
            System.out.print("  " + a[i]);
        System.out.println();
    }


    public void swap(int i, int k) {
        int x;
        x=a[i];
        a[i]=a[k];
        a[k]=x;
    }

// Hàm sắp xếp bằng thuật toán nổi bọt, sau mỗi bước sắp xếp hãy gọi tới hàm display() để hiển thị giá trị của mảng a ra màn hình
    public void bubbleSort() {
        for (int i= n-1; i > 0; i--) {
            boolean swapped = false;
            for (int j=0; j < i; j++){
                if (a[j + 1] < a[j]) {
                    swap(j, j + 1);
                    swapped = true;
                }

            }
            display();
            if (!swapped){
                break;
            }

        }

    }

}
