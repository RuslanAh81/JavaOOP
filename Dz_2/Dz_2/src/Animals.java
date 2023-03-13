import java.util.ArrayList;

public class Animals {
    private double height;
    private double weight;
    private String eyesColor;
    private ArrayList<Animals> animals;

    public Animals() {
        this.animals = new ArrayList<Animals>();
    }


    public void addAnimal(Animals animals) {
        this.animals.add(animals);
    }


    public Animals(double height, double weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public void makeSound() {

    }

    @Override
    public String toString() {
        return "Животное{" +
                "Рост=" + height +
                ", Вес=" + weight +
                ", Цвет глаз='" + eyesColor + '\'' +
                '}';
    }

    public void printAllAnimals() {
        System.out.println(" Все животные ");
        for (int i = 0; i < this.animals.size(); i++) {
            System.out.println((i + 1) + "." + this.animals.get(i).getClass().getName());
            //System.out.println(this.animals.get(i));
        }
        System.out.println();
    }
}
