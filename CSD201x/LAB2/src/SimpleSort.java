public class SimpleSort {

    int [] a; int n;

    public SimpleSort(int [] b) {
        int i;
        n = b.length;
        a = new int[n];
        for(i=0;i<n;i++) a[i]= b[i];
    }

    public void display()
    {int i;
        for(i=0;i<n;i++)
            System.out.print("  " + a[i]);
        System.out.println();
    }

    // Swap element at position i with element at position k
    public  void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void selectSort(){
        for (int i=0; i < a.length - 1; i++){
            int indexMin = i;
            for (int j=i +1; j < a.length; j++){
                if (a[j] < a[indexMin]) {
                    indexMin = j;
                }
            }
            swap(a, indexMin, i);
        }
    }

    public void insertSort() {
        for (int i=1; i < a.length; i++) {
            int index = i;
            int value = a[i];
            while (index > 0 && a[index - 1] > value) {
                a[index] = a[index - 1];
                index--;
            }
            a[index] = value;
        }
    }

    public int Search(int value){
        for (int i=0; i < a.length; i++){
            if (a[i] == value) return i;
        }
        return -1;
    }

}
