package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductBook <T> implements Serializable {
    public String getName;
    private List<T> listOfProducts = new ArrayList<T>();

    public ProductBook(T product){
        if(product != null){
            listOfProducts.add(product);
        }
    }

    public ProductBook(){
        this(null);
    }
//    public T getProduct(String name){
//        T productSearch = null;
//        for( int i =0; i<listOfProducts.size(); i++){
//            if(listOfProducts.get(i).getName().equals(name)){
//                productSearch = listOfProducts.get(i);
//            }
//        }
//        return productSearch;
//    }

    public void setProducts(T product){
        listOfProducts.add(product);
    }

    public String toString(){
        return listOfProducts.toString();
    }


}
