package ui;

import java.io.IOException;

public interface Option {
    String description();

    void exit() throws IOException, ClassNotFoundException;
}
