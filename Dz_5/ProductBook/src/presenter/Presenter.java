package presenter;
import model.Notebook;
import ui.View;

import java.io.IOException;

public class Presenter  {
    private Notebook note = new Notebook();
    private View view;
    public Presenter(View view){
        this.view = view;
        view.setPresenter(this);
    }
    public String testBook() {
        return note.testBook();
    }

    public String loadData() throws IOException, ClassNotFoundException {
        return note.loadData();
    }

    public String saveData() throws IOException {
        return note.SaveData();
    }



    public String addProduct(String name, String price, int quantity){

        note = new Notebook();

        return note.addProduct(name,price,quantity);
    }

    public String removeProduct(String name){
        return note.removeProduct(name);
    }

    public String updateProduct(String name, String price, int quantity){
        return note.updateProduct(name, price, quantity);
    }

//    public String showProduct(){
//        return model.printProductBook();
//    }

    public String printProduct(){
        //System.out.println(" Я тут");
        return note.printProductBook();
    }
}
