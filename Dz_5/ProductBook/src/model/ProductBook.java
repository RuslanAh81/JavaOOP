package model;

public class ProductBook {
    private String name;
    private String price;
    private int quantity; // Количество
    public ProductBook (String name, String price, int quantity){
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
