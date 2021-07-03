import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /*sf
    * sdf
    * */
    public static void main(String[] args) {
        ArrayList<SinhVien> sv = new ArrayList<>();

        sv.add(new SinhVien("son", 3.2));
        sv.add(new SinhVien("ha", 3.3));
        double avg=0;
        for(int i=0; i < sv.size();i++) {
            //        Scanner sc = new Scanner(System.in);
            avg += sv.get(i).getPoint();

        }
        avg /= sv.size();
        System.out.println(avg);
//        double point;
//        do {
//            while (!sc.hasNextDouble()) {
//                sc.next();
//
//            }
//            point = sc.nextDouble();
//        } while (point < 0);
//        System.out.println(point);
////        xephang(point);
    }
    public void xephang(double point){
            if(point > 8.0){
                System.out.println("Xep loai gioi");
            } else {
                System.out.println("Xep loai trung binh");
            }
    }


}
