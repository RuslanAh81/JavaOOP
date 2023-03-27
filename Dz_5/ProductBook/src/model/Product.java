package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String price;
    private int quantity; // Количество
    public Product(String name, String price, int quantity){
        this.name = name;
        this.price  = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ProductBook{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
