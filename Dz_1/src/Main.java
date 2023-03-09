public class Main {
    public static void main(String[] args) {

        Product mask = new Masks(5,"Да", "Маска Зайца", 1000, 1, "шт");
        Product eggs = new Eggs(10, 10, "Яйцо", 80, 1, "Упаковка");
        Product lemonade = new Lemonade(1.5, "литр", "Байкал", 100, 1, "Бутылка");
        Product milk = new Milk(2, 1, "Вкуснотеево", 80, 1, "Упаковка");
        Product diapers = new Diapers(14, 1, 30, "soft", 10,"Haggies",250,1,"Упаковка" );
        Product toiletPaper = new ToiletPaper(1,12,"Zewa", 200,1,"Упаковка");
        Product babyPacifier = new BabyPacifier(1,"Да","Соска детская", 500, 1,"Шт");
        Product bread = new Bread("Ржаная", 3, "7 комбинат", 60,1,"Шт");
//        System.out.println(diapers);

        Program.bay(milk);
        Program.bay(lemonade);
        Program.bay(bread);
        Program.bay(eggs);
        Program.bay(mask);
        Program.bay(toiletPaper);
        Program.bay(diapers);
        Program.bay(babyPacifier);
    }
}