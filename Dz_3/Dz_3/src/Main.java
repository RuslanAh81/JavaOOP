public class Main {
    public static void main(String[] args) throws Exception {
        CollectionFig collectionFig= new CollectionFig();
        CollectionFig.addFigure(new Triangle(6,9,8));
        CollectionFig.addFigure(new Rectangle(8,14));
        CollectionFig.addFigure(new Circle(6));
        CollectionFig.addFigure(new Square(8));
        System.out.println("Вывод информации о фигурах");
        CollectionFig.showAll();
//        System.out.println("Удаление фигуры по индексу 0");
//        CollectionFig.removeFigure(0);
//        System.out.println("Вывод информации после удаления");
//        CollectionFig.showAll();
        System.out.println("Заменить фигуру под номером 3 в коллекции");
        CollectionFig.setFigure(2, new Circle(5));
        System.out.println("Вывод после изменения");
//        CollectionFig.showAll();
        CollectionFig.sortByArea();
        System.out.println("Фигуры отсортированы по площади");
        CollectionFig.showAll();
    }
}