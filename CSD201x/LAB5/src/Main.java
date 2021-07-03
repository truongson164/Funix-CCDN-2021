public class Main {
// Hàm thuật toán chuyển đổi 1 số nguyên ở hệ đếm thập phân sang nhị phân ( Ta chia liên tiếp số nguyên đó cho 2 đến bao giờ //thương bằng 0 thì dừng lại, kết quả của phép chuyển đổi là phần dư của các phép chia theo thứ tự ngược lại)

    public static void main(String [] args) {
        int x=5;
        MyStack t = new MyStack();
        t.CovertToBinary(x);
        System.out.println();
    }
}
