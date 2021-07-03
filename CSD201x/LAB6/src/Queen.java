
public class Queen {
/*    Kiểm tra quân hậu hàng n cột q[n]
    có bị nguy hiểm bởi quân hậu khác đã chọn ở các hàng trước đó không.*/
    public  boolean isConsistent(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]) return false;   // same column
            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
        }
        return true; //An toàn thì trả về true
    }

    public  void printQueens(int[] q) {
        for (int j : q) System.out.print(j + 1);
        System.out.println();
    }
//  Tạo mảng a có n phần tử
    public  void enumerate(int n) {
        int[] a = new int[n]; //Tạo mảng n phần tử. chỉ số là hàng tương ứng, giá trị là cột tương ứng.
        enumerate(a, 0); //Xét quân hậu ở hàng 0.
    }
/*  Thử các tất cả các hoán vị dùng thuật quay lui (backtracking) */
    public  void enumerate(int[] q, int k) {
        int n = q.length;
        if (k == n) printQueens(q);
        else {
            /* Lần lượt xét quân hậu ở hàng 0 -> n-1, ở cột i nào đó thỏa mãn,
            nếu thỏa mãn xét quân hậu hàng sau, nếu ko quay lại xét quân hậu trước đó với cột khác cột đã chọn. */

            for (int i = 0; i < n; i++) { //Các trường hợp quân hậu ở các cột thuộc 1 hàng nhất định
                q[k] = i; // Đặt quân hậu ở cột i
                if (isConsistent(q, k)) enumerate(q, k + 1);// Nếu an toàn thì xét quân hậu hàng tiếp theo
            }
        }
    }


}