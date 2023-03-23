package presenter;
import model.Model;
import model.ProductBook;
import ui.View;

public class Presenter  {
    private Model model = new Model();
    private View view;
    public Presenter(View view){
        this.view = view;
        view.setPresenter(this);
    }



    public String addProduct(String name, String price, int quantity){

        model = new Model();

        return model.addProduct(name,price,quantity);
    }

    public String removeProduct(String name){
        return model.removeProduct(name);
    }

    public String updateProduct(String name, String price, int quantity){
        return model.updateProduct(name, price, quantity);
    }

//    public String showProduct(){
//        return model.printProductBook();
//    }

    public String printProduct(){
        //System.out.println(" Я тут");
        return model.printProductBook();
    }
}
