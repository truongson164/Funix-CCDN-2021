package mypackage;

import java.io.*;
import java.util.Scanner;

public class OperationToProduct {

//    Cread a product have:(ID, name, quantity, price) that input from keyboard
    public static Product createProduct(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input new Product's ID: ");
        String bcode = sc.next();
        sc.nextLine();
        System.out.print("Input new Product's Title: ");
        while(!sc.hasNextLine()){
            sc.nextLine();
            if(!sc.hasNextLine()){
                System.out.print("Input new Product's Title again: ");
            }
        }
        String title = sc.nextLine();

        System.out.print("Input new Product's quantity: ");
        while(!sc.hasNextInt()){

            sc.next();
            if(!sc.hasNextInt()){
                System.out.print("Input new Product's quantity again: ");
            }
        }
        int quantity = sc.nextInt();
        System.out.print("Input new Product's price: ");
        while(!sc.hasNextDouble()){
            if(!sc.hasNextDouble()){
                System.out.print("Input new Product's price again: ");
            }
            sc.next();
        }
        double price = sc.nextDouble();

        return new Product(bcode, title, quantity, price);


    }

// Read all products from file and save to Linked List ( Insert at tail of Linked List), infor of a product in a line (
    public static void getAllItemsFromFile(String fileName, MyList list){

        try {
            FileReader fr  = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null ){
                String[] arr = line.split("[|]");
                String bcode = arr[0].trim();
                String title = arr[1].trim();
                int quantity = Integer.parseInt(arr[2].trim());
                double price = Double.parseDouble(arr[3].trim());
                Product product = new Product(bcode, title, quantity, price);
                Node node = new Node(product);
                list.insertToTail(node);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.traverse();

    }

    public static void getAllItemsFromFile(String fileName, Mystack stack){
        try {
            FileReader fr  = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null ){
                String[] arr = line.split("[|]");
                String bcode = arr[0].trim();
                String title = arr[1].trim();
                int quantity = Integer.parseInt(arr[2].trim());
                double price = Double.parseDouble(arr[3].trim());
                Product product = new Product(bcode, title, quantity, price);
                Node node = new Node(product);
                stack.push(node);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("""
                Information of all products:\s
                ID |  Title   | Quantity | price
                --------------------------------""");
        stack.traverse();

    }

    public static void getAllItemsFromFile(String fileName, Myqueue queue){
        try {
            FileReader fr  = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null ){
                String[] arr = line.split("[|]");
                String bcode = arr[0].trim();
                String title = arr[1].trim();
                int quantity = Integer.parseInt(arr[2].trim());
                double price = Double.parseDouble(arr[3].trim());
                Product product = new Product(bcode, title, quantity, price);
                Node node = new Node(product);
                queue.enqueue(node);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("""
                Information of all products:\s
                ID |  Title   | Quantity | price
                --------------------------------""");
        queue.traverse();



    }

// Add a new product into tail of Linked List
    public static void addLast(MyList list, Product product){

        Node node = new Node(product);
        list.insertToTail(node);
        displayAll(list);
    }

// Display information of all product on Linked list
    public static void displayAll(MyList list){
        System.out.println("""
                Information of all products:\s
                ID |  Title   | Quantity | price
                --------------------------------""");
        list.traverse();
    }

// Wite all product of Linked List to file
    public static void writeAllItemsToFile(String fileName, MyList list){
        try {
            FileWriter file = new FileWriter(fileName);
            file.write(list.toString());
            file.close();
            System.out.println("Saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeAllItemsToFile(String fileName, String content){
        try {
            File file = new File(fileName);
            FileWriter fr = new FileWriter(file, true);
            fr.write(content);
            fr.close();
            System.out.println("Saved to output file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// Search first element by ID
    public static void searchByCode(MyList list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Search Product with ID keywords: ");
        String ID = sc.next();
        System.out.println(list.findByID(ID));
    }

// Delete first element by ID (=ID)
    public static void deleteByCode(MyList list){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input new Product's ID: ");
        String id = sc.next();
        list.deleteElement(id);
        displayAll(list);
    }

// Sort by ID
    public static void sortByCode(MyList list){
        list.quickSortByID(list.getHead(), list.getTail());
        displayAll(list);
    }

//Convert to Binary
    public static void Convert_Binary(MyList list){
        int i = list.getHead().getInfo().getQuantity();
        System.out.println(list.convertToBinary(i));
    }

}


