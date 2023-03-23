package ui.commands;

import ui.Console;

import java.io.IOException;

public class AddProduct extends Command{
    public AddProduct(Console console){
        super(console);
        //System.out.println(" Добавить продукт");
    }

    public String description(){
        return "Добавить продукт";
    }

    @Override
    public void exit() throws IOException, ClassNotFoundException {
        getConsole().addProduct();
    }
}
