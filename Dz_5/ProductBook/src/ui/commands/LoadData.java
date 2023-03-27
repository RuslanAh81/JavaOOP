package ui.commands;

import ui.Console;

import java.io.IOException;

public class LoadData extends Command{
    public LoadData(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Загрузить сохраненные данные";
    }

    @Override
    public void exit() throws IOException, ClassNotFoundException {
        getConsole().loadData();

    }
}
