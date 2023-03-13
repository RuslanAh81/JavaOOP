import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //List<Animals> animalsList = new ArrayList<>();
        Chicken chicken = new Chicken(3);
        Stork stork = new Stork(500);
        Animals cat = new Cat("да", 0.3, 2.0, "Голубые");
        Animals dog = new Dog("да", 0.800, 5.0, "Карие");
        Animals tiger = new Tiger(2.0, 100.0, "Боюсь посмотреть");
        Animals wolf = new Wolf("Да", 2.0, 80.0, "карие");
        Animals animals = new Animals();
        animals.addAnimal(chicken);
        animals.addAnimal(stork);
        animals.addAnimal(cat);
        animals.addAnimal(dog);
        animals.addAnimal(tiger);
        animals.addAnimal(wolf);
        Zoo myZoo = new Zoo();
        myZoo.addAnimal(wolf);
        myZoo.addAnimal(tiger);
//        stork.info();
//        stork.fly();
//        stork.sound();
//        chicken.info();
        //      chicken.fly();
//        System.out.println(animalsList);
//        ((Cat) cat).showAffection();
//        ((Cat)cat).info();
//        cat.makeSound();
//        ((Dog)dog).info();
//        myZoo.printAnimals();
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите пункт :\n" +
                    "1.Посмотреть животных \n2.Посмотреть Зоопарк\n3.Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    animals.printAllAnimals();
                    System.out.println("Выберите животное :");
                    int choice2 = sc.nextInt();
                    if (choice2 == 1) {
                        System.out.println(chicken.getClass());
                        Programm.menu();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            chicken.info();
                            chicken.fly();
                        }
                        if (choice3 == 2) {
                            myZoo.addAnimal(chicken);
                            System.out.println("Животное добавлено в зоопарк");
                        }
                        if (choice3 == 3) {
                            chicken.sound();
                        }
                    }
                    if (choice2 == 2) {
                        System.out.println(stork.getClass());
                        Programm.menu();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            stork.info();
                            stork.fly();
                        }
                        if (choice3 == 2) {
                            myZoo.addAnimal(stork);
                            System.out.println("Животное добавлено в зоопарк");
                        }
                        if (choice3 == 3) {
                            stork.sound();
                        }
                    }
                    if (choice2 == 3) {
                        System.out.println(cat.getClass());
                        Programm.menu();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            ((Cat) cat).info();
                        }
                        if (choice3 == 2) {
                            myZoo.addAnimal(cat);
                            System.out.println("Животное добавлено в зоопарк");
                        }
                        if (choice3 == 3) {
                            ((Cat) cat).makeSound();
                        }
                    }
                    if (choice2 == 4) {
                        System.out.println(dog.getClass());
                        Programm.menu();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            ((Dog) dog).info();
                        }
                        if (choice3 == 2) {
                            myZoo.addAnimal(dog);
                            System.out.println("Животное добавлено в зоопарк");
                        }
                        if (choice3 == 3) {
                            ((Dog) dog).makeSound();
                        }
                    }
                    if (choice2 == 5) {
                        System.out.println(tiger.getClass());
                        Programm.menu();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            ((Tiger) tiger).info();
                        }
                        if (choice3 == 2) {
                            myZoo.addAnimal(tiger);
                            System.out.println("Животное добавлено в зоопарк");
                        }
                        if (choice3 == 3) {
                            ((Tiger) tiger).makeSound();
                        }
                    }
                    if (choice2 == 6) {
                        System.out.println(wolf.getClass());
                        Programm.menu();
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            ((Wolf) wolf).info();
                        }
                        if (choice3 == 2) {
                            myZoo.addAnimal(wolf);
                            System.out.println("Животное добавлено в зоопарк");
                        }
                        if (choice3 == 3) {
                            ((Wolf) wolf).makeSound();
                        }
                    }
                    break;
                case 2:
                    myZoo.printAnimals();
                    Programm.zooMenu();
                    int choice3 = sc.nextInt();
                    if (choice3 == 1) {
                        //System.out.println("Посмотреть инфо");
                        myZoo.printAnimals();
                        System.out.println("Выберите номер животного");
                        myZoo.printAnimals();
                        int number = sc.nextInt();
                        myZoo.viewAnimal(number);
                    }
                    if (choice3 == 2) {
                        System.out.println("Выберите номер животного");
                        myZoo.printAnimals();
                        int number2 = sc.nextInt();
                        myZoo.removeAnimal(number2);
                        System.out.println("Животное удалено");
                    }

                    if (choice3 == 3) {
                        myZoo.makeAllSound();
                    }
                default:
                    flag = false;

            }

        }

    }


}