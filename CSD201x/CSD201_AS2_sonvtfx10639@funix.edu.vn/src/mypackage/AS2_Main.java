package mypackage;

import java.util.Scanner;

import static mypackage.OperationToProduct.*;


public class AS2_Main {

//Hien thi menu
    public static void showMenu(){

        System.out.println("\nChoose one of this options:");
        System.out.println("Product list:");
        System.out.println("1. Load data from file and display");
        System.out.println("2. Input & add to the end.");
        System.out.println("3. Display data");
        System.out.println("4. Save product list to file.");
        System.out.println("5. Search by ID");
        System.out.println("6. Delete by ID");
        System.out.println("7. Sort by ID.");
        System.out.println("8. Convert to Binary");
        System.out.println("9. Load to stack and display");
        System.out.println("10. Load to queue and display.");
        System.out.println("0. Exit");

    }

//Chuong trinh chinh
    public static void main(String[] args) {

        MyList list = new MyList();
        Mystack stack = new Mystack();
        Myqueue queue = new Myqueue();
        Scanner sc = new Scanner(System.in);
        String choice = null;

//        Vong lap chinh
        do {
            showMenu();
            switch (choose_actions()) {
                case 1 -> getAllItemsFromFile("./data.txt", list);
                case 2 -> addLast(list, createProduct());
                case 3 -> displayAll(list);
                case 4 -> writeAllItemsToFile("./data.txt", list);
                case 5 -> searchByCode(list);
                case 6 -> deleteByCode(list);
                case 7 -> sortByCode(list);
                case 8 -> Convert_Binary(list);
                case 9 -> getAllItemsFromFile("./data.txt", stack);
                case 10 -> getAllItemsFromFile("./data.txt", queue);
                case 0 -> choice = "n";
            }
            if (choice != "n") {
                System.out.println("Type any key to choose another actions or \"n\" to exit: ");
                choice = sc.next();
            }

        } while (!choice.equals("n"));


    }

//Chon chuc nang trong menu
    public static int choose_actions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuc nang (0~10): ");
        while (!sc.hasNextInt()) {
            if (!sc.hasNextInt()) {
                System.out.print("Nhap lai (0~10): ");
            }
            sc.next();
        }
        return sc.nextInt();

    }



}

