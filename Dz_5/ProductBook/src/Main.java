import presenter.Presenter;
import ui.View;
import ui.Console;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException, ClassNotFoundException {
        View view = new Console();
        new Presenter(view);
        view.start();


    }

}