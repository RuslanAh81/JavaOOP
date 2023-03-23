package ui.commands;
import ui.Console;

public class ZeroInput extends Command{
    public ZeroInput(Console console){
        super(console);
    }

    public String description (){
        return "Неверный ввод";
    }

    public void exit() {
        getConsole().errorInput();
    }
}
