package model;
import ui.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Model {
    private View view;
//    private  Model model = new Model();
    private List<ProductBook> products;
    private Scanner sc = new Scanner(System.in);

    public Model(){
        products = new ArrayList<ProductBook>();

        products.add(new ProductBook("name1", "0",1));// создание списка продуктов
        products.add(new ProductBook("name2", "0",1));
    }

    public String addProduct(String name, String price, int quantity){
        String comment;
        products.add(new ProductBook(name, price, quantity));
        return comment = " Запись создана В модел";
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
//        stringBuilder.append("\n");
//        for (int i = 0; i < products.size(); i++) {
//
//            stringBuilder.append(i);
//            stringBuilder.append(": ");
//            stringBuilder.append(products.get(i));
//            stringBuilder.append("\n");
//        }
        return products.toString();
    }
}
