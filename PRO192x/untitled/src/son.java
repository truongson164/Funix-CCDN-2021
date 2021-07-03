import java.util.Scanner;
import java.util.ArrayList;
public class son {
    float x;
    private float y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        acc Ha = new acc();
        Ha.setSalary(100000.0);
        System.out.println(Ha.toString());
        Ha.setGender("name");

    }
    public static void Re(Scanner sc){
        String s = sc.next();
        if (s.equals("son")) {
            System.out.println("Thanh cong");
        } else {
            System.out.println("That bai");
        }
    }
//    public static void R(){
//        int[]a= {1, 2,3};
//        int sum=0;
//        for(int i=0; i<a.length; i++){
//            sum+=a[i];
//        }
//
//    }

    public static void A(){

        ArrayList<String> list = new ArrayList<String>();

        list.add("son");
        list.add("sd");
        list.add("2");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
