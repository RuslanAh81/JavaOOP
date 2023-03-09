public class Product {
    private String name;
    private int price;
    private int quantity;
    private String measure;
    public Product (String name, int price,int quantity,String measure){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measure = measure;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    @Override
    public String toString() {
        return "Продукт {" +
                "название = '" + name + '\'' +
                ", цена = " + price +
                ", количество = " + quantity +
                ", ед.измерения ='" + measure + '\'' +
                '}';
    }
}