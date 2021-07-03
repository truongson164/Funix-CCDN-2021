package mypackage;

public class Product {
    // Declare fields of Product
    private String bcode;
    private String title;
    private int quantity;
    private double price;

//2. Constructor method
    public Product(String bcode, String title, int quantity,  double price) {
        this.bcode = bcode;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

//  toString  method using for display
    public String toString() {
        return bcode + " | " + title + " | " + quantity + " | " + price;
    }

    public String getBcode() {
        return bcode;
    }

    public int getQuantity() {
        return quantity;
    }
}

