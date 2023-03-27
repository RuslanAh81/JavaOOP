package ui;

import presenter.Presenter;
import ui.commands.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Menu {
    private List<Option> commands;
    private Console console;
    public Menu(Console console){
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new ZeroInput(console));
        commands.add(new LoadData(console));
        commands.add(new SaveData(console));
        commands.add(new AddProduct(console));
        commands.add(new RemoveProduct(console));
        commands.add(new UpdateProduct(console));
        commands.add(new ShowProduct(console));
        commands.add(new PrintProductBook(console));
        commands.add(new Exit(console));
        //System.out.println(commands);

    }
    void exit(int num) throws IOException, ClassNotFoundException{
        Option option = commands.get(num);
        option.exit();
    }
    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (int i = 1; i<commands.size(); i++){
            stringBuilder.append(i);
            stringBuilder.append(":");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public Integer getMenuRowsValue(){
        return commands.size();

    }


}
