package model;
import ui.View;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Notebook implements FileData{
    private View view;
    private  Notebook notebook;
    private ProductBook products= new ProductBook();

//    private Scanner sc = new Scanner(System.in);

    public String testBook(){
        String comment;
//        products = new ProductBook(List.of());

        products.setProducts(new Product("Хлеб", "50",1));// создание списка продуктов
        products.setProducts(new Product("Молоко", "80",1));
        return comment = " Список";
    }

    public String loadData() throws  IOException, ClassNotFoundException{
        String comment;
        products = (ProductBook) read("products.bin");
        return comment = "Данные загружены";
    }
    public String addProduct(String name, String price, int quantity){
        String comment;
        products.setProducts(new Product(name, price, quantity));
        return comment = " Запись создана В Продуктовой книжке";
    }



    public String SaveData() throws IOException{
        String comment;
        save((Serializable) products,"products.bin");
        return comment = " Данные сохранены";
    }


    public String removeProduct(String name){

        return " Продукт удален";
    }

    public String updateProduct(String name, String price, int quantity){

        return "Продукт обновлен";
    }


    @Override
    public String toString() {
        return "Model{" +
                "products=" + products +
                '}';
    }
//    public String printProductBook(){
//        return  "Model{" +
//                "products=" + products +
//                '}';
//
//    }

    public String printProductBook() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Object prod:products){
//            stringBuilder.append(prod.toString());
//
//        }
        return products.toString();
    }

    @Override
    public void save(Serializable serializable, String filename) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();

    }

    @Override
    public Object read(String filename) throws IOException, ClassNotFoundException {
        Object result = new Object();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename));
        result = objectInputStream.readObject();
        objectInputStream.close();
        return result;
    }
}
