import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animals> animals;

    public Zoo() {
        this.animals = new ArrayList<Animals>();
    }

    public void addAnimal(Animals animals) {
        this.animals.add(animals);
    }

    public void removeAnimal(int number) {
        this.animals.remove(number - 1);
    }

    public void viewAnimal(int number) {
        System.out.println(this.animals.get(number - 1).getClass().getName());
        System.out.println(this.animals.get(number - 1));
    }

    public void makeAllSound() {
        for (Animals item : this.animals) {
            System.out.println(item.getClass().getName() + ": ");
            item.makeSound();
        }
        System.out.println();
    }

    public void printAnimals() {
        System.out.println(" Все животные в зоопарке ");
        for (int i = 0; i < this.animals.size(); i++) {
            System.out.println((i + 1) + "." + this.animals.get(i).getClass().getName());
            //System.out.println(this.animals.get(i));
        }
        System.out.println();
    }

}
