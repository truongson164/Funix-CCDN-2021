package mypackage;


import java.util.Arrays;
import java.util.Scanner;

import static mypackage.Algorithm.*;

public class MainSort {
//Chuong trinh chinh
    public static void main(String[] args) {
        float[] arrayA = new float[0];
        float[] arrayB ;
        Scanner sc = new Scanner(System.in);
        String choice = "";
    //Vong lap chinh
        do {

            intro();
            int number = choose_menu_actions(sc);

            switch (number) {
                case 0 -> choice = "n";
                case 1 -> write_file(input(sc), "./INPUT.txt");
                case 2 -> arrayA = Read_file();
                case 3 -> {
                   arrayB = arrayA.clone() ;
                    BubbleSort(arrayB);
                    write_file(arrayB, "./OUTPUT1.txt");
                }
                case 4 -> {
                    arrayB = arrayA.clone() ;
                    SelectionSort(arrayB);
                    write_file(arrayB, "./OUTPUT2.txt");
                }
                case 5 -> {
                    arrayB = arrayA.clone() ;
                    InsertionSort(arrayB);
                    write_file(arrayB, "./OUTPUT3.txt");
                }
                case 6 -> {
                    arrayB = arrayA.clone();
                    float num = input_numbers();
                    write_file(Search(arrayB, num), "./OUTPUT4.txt");
                }
                case 7 -> {
                    arrayB = arrayA.clone();
                    float num = input_numbers();
                    BubbleSort(arrayB);
                    String result = binarySearch(arrayB, 0, arrayB.length -1, num) + "";
                    System.out.println("Binary Search:\nChi so cua phan tu dau tien bang: " + result);
                    write_file(result, "./OUTPUT5.txt");
                }
            }
            if(!choice.equals("n")){
                System.out.println("An \"n\" de dung hoac phim bat ky de chon cac chuc nang khac : ");
                choice = sc.next();
            }

        } while(!choice.equals("n"));

    }
//Nhap n phan tu trong mang
    public static float[] input(Scanner sc) {

        System.out.print("Nhap so phan tu n: ");
        int n;
        do {
            while (!sc.hasNextInt()) {
                if (!sc.hasNextInt()) {
                    System.out.print("Nhap lai n: ");
                }
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);

        float[] arr = new float[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            while (!sc.hasNextFloat()) {
                if (!sc.hasNextFloat()){
                    System.out.print("Nhap lai phan tu thu " + (i + 1) + ": ");
                }
                sc.next();
            }
            float element = sc.nextFloat();
            arr[i] = element;
        }

        return arr;
    }

//Gioi thieu chuc nang menu
    public static void intro(){
        System.out.println("""
                +-----------------Menu------------------+
                |      1.Input                          |
                |      2.Output                         |
                |      3.Bubble sort                    |
                |      4.Selection sort                 |
                |      5.Insertion sort                 |
                |      6.Search > value                 |
                |      7.Search = value                 |
                |      0.Exit                           |
                +--------------------------------------.+""");

    }

//Chon chuc nang tren menu
    public static int choose_menu_actions(Scanner sc){
        System.out.print("Choose number (0 ~ 7): ");
        int number;
        do {
            while(!sc.hasNextInt()) {
                if (!sc.hasNextInt()){
                    System.out.print("Nhap lai so (0 ~ 7): ");
                }
                sc.next();
            }
            number = sc.nextInt();
            if (number < 0 || number > 7) {
                System.out.print("Nhap lai so (0 ~ 7) : ");
            }
        } while (number < 0 || number > 7);

        return number;

    }

//Nhap gia tri can tim kiem
    public static float input_numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri can tim kiem: ");
        while (!sc.hasNextFloat()){
            if (!sc.hasNextFloat()){
                System.out.print("Nhap lai: ");
            }
            sc.next();
        }
        return sc.nextFloat();
    }
}

