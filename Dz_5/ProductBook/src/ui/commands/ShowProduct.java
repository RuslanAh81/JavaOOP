package ui.commands;

import ui.Console;

import java.io.IOException;

public class ShowProduct extends Command{
    public ShowProduct(Console console){
        super(console);
    }

    public String description(){
        return "Показать продукт";
    }

    @Override
    public void exit() throws IOException, ClassNotFoundException {

    }
}
