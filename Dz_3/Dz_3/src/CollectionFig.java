
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


public class CollectionFig {
    private static final List<Figure> figures ;
    static {
        figures=new ArrayList<>();
    }

    public static void addFigure(Figure figure){
        figures.add(figure);
    }

    public static void removeFigure(int number) {
        try {
            figures.remove(number - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы коллекции");
        }
    }
    public static void showAll(){
        System.out.println("Имеем");
        for (int i = 0; i<figures.size(); i++){
            System.out.println("n" + (i+1) + ". ");
            System.out.println(figures.get(i));
        }
    }

    public static void setFigure(int number,Figure figure){
        figures.set(number-1,figure);
    }

    public static void sortByArea(){
        Collections.sort(figures);
    }
}
