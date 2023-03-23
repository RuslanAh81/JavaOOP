package ui.commands;
import ui.Console;
public class Exit extends Command {


        public Exit(Console console) {
            super(console);
            //System.out.println(" Exit");
        }
        @Override
        public String description() {
            return "Завершение работы";
        }

        @Override
        public void exit() {
            getConsole().finish();
        }

}
