package ui;



import presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;


public class Console implements View {
    private Scanner scanner = new Scanner(System.in);
    private Presenter presenter;
    private Menu menu;
    private Boolean flag;
    private Validator validator;



    public void start() throws IOException, ClassNotFoundException {
        menu = new Menu(this);
        flag = true;
        validator = new Validator();
//        printMenu();
//        System.out.println("oop");
//        menu.exit(menu.getMenuRowsValue());
        while(flag){
            printMenu();
            //System.out.println("consol start");
            menu.exit(validator.checkInput(scanner.next(),menu.getMenuRowsValue()));
            //System.out.println(" cons");
        }
    }

    private void printMenu(){
        System.out.println(menu.printMenu());
        //System.out.println(" Cons prntMen");
    }

    public void addProduct(){
        System.out.println("Ведите данные продукта");
        System.out.println("Введите назвние");
        String name = scanner.next();
        System.out.println(" Введите цену");
        String price = scanner.next();
        System.out.println("Введите количество");
        Integer quantity = scanner.nextInt();
//        presenter = new Presenter(this);
        System.out.println(presenter.addProduct(name,price,quantity));
    }

    public void updateProduct(){
        System.out.println("Ведите данные продукта");
        System.out.println("Введите назвние");
        String name = scanner.next();
        System.out.println(" Введите цену");
        String price = scanner.next();
        System.out.println("Введите количество");
        Integer quantity = scanner.nextInt();
        System.out.println(presenter.addProduct(name,price,quantity));
    }

    public void removeProduct(){
        System.out.println("Введите название");
    }


    public void errorInput(){
        System.out.println("Ошибка ввода");
    }

    public void printProductBook(){

        System.out.println(presenter.printProduct());
    }

    public void finish(){
        flag = false;
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

}
