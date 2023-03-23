package ui.commands;

import ui.Console;

public class PrintProductBook extends Command {
    public PrintProductBook(Console console){
        super(console);
    }
    public String description(){
        return "Вывести псисок продуктов";
    }
    public void exit(){
    getConsole().printProductBook();

    }
}
