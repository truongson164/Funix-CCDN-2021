package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Algorithm {

//1. Write data from array to file
    public static void write_file(float[] a, String path) {
    //Tao file text
        createFile(path);
    //Ghi cac phan tu vao file text
        try {
            FileWriter my = new FileWriter(path);
            String string = "";
            for (float v : a) {
                string += v + " ";
            }
            my.write(string);
            my.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

//Write file
    public static void write_file(String a, String path){
    //Tao file text
        createFile(path);
    //Ghi cac phan tu vao file text
        try {
            FileWriter my = new FileWriter(path);
            my.write(a);
            my.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

//2. Read data from file to array
    public static float[] Read_file() {
        String data = getFromFileToString("./INPUT.txt");
        System.out.println(data);

        String PATTERN = "\\s";
        Pattern pattern = Pattern.compile(PATTERN);
        String[] array = pattern.split(data);

        float[] arrayA = new float[array.length];
        for(int i=0; i < arrayA.length; i++){
            arrayA[i] = Float.parseFloat(array[i]);
        }
        return arrayA;
    }

//3. Sort by Bubble Sort
    public static void BubbleSort(float[] arr) {

        System.out.println("Bubble sort:");
        printArray(arr);

        for(int i=0; i <arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
                printArray(arr);
            }
            if (!swapped) break;
        }

    }

//4. Sort bay Selection Sort
    public static void SelectionSort(float[] arr) {

        System.out.println("Selection Sort:");
        printArray(arr);

        for (int i=0; i < arr.length -1; i++){
            int indexMin = i;
            for (int j=i+1; j < arr.length; j++){
                if(arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
                printArray(arr);
            }

           swap(arr, i, indexMin);
            printArray(arr);

        }
    }

//5. Sort by Insertion Sort
    public static void InsertionSort(float[] arr) {
        System.out.println("Insertion Sort:");
        printArray(arr);

        for (int i=1; i < arr.length; i++){
            int index = i;
            float value = arr[i];
            while (index > 0 && arr[index -1] > value){
                arr[index] = arr[index - 1];
                index--;
                printArray(arr);
            }
            arr[index] = value;

            printArray(arr);
        }

    }

//6. Serach by Linear Search algorith:
    public static String Search(float[] arr, float value) {
        String string = "";

        for (int i=0; i < arr.length; i++) {
            if (arr[i] > value) {
                string += i + " ";
            }
        }
        if (string == "") {
            System.out.println("Khong co chi so nao.");
        } else {
            System.out.println("Chi so: "+ string);
        }
        return string;
    }

//7. Search by binary Search algorithm
    public static int binarySearch(float[] arr, int l, int  r, float x) {
        if (l <= r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x){
                return mid;
            }
            if (x < arr[mid]){
                return binarySearch(arr, l, mid -1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;

    }

//    In Mang array
    public static void printArray(float[] arr) {
        System.out.println(Arrays.toString(arr).replace(",", "")
                .replace("[", "")
                .replace("]", ""));
    }

    public static void swap(float[] arr, int i, int j){
        float temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

//    Tao file moi voi dia chi path
    public static void createFile(String path){
        try {
            File inputFile = new File(path);
            if (inputFile.createNewFile()) {
                System.out.println("File created: " + inputFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    public static String getFromFileToString(String path) {
        String data ="";
        try {
            File textFile = new File(path);
            Scanner sc = new Scanner(textFile);
            while(sc.hasNextLine()){
                data = sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}