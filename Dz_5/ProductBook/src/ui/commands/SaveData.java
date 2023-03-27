package ui.commands;

import ui.Console;

import java.io.IOException;

public class SaveData extends Command {
    public SaveData(Console console) {
        super(console);
    }

    public String description(){
        return "Сохранить текущее состояние";
    }

    public void exit() throws IOException {
        getConsole().saveData();
    }
}
