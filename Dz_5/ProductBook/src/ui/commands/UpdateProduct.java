package ui.commands;

import ui.Console;

import java.io.IOException;

public class UpdateProduct extends Command{
    public UpdateProduct(Console console){
        super(console);
    }

    public String description(){
        return "Обновить продукт";
    }

    @Override
    public void exit() throws IOException, ClassNotFoundException {
        getConsole().updateProduct();
    }


}
