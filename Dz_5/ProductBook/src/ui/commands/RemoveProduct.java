package ui.commands;

import ui.Console;

import java.io.IOException;

public class RemoveProduct extends Command{
    public RemoveProduct(Console console){
        super(console);

    }

    public String description (){
        return "Удалить продукт из списка";
    }

    @Override
    public void exit() throws IOException, ClassNotFoundException {

    }
}
