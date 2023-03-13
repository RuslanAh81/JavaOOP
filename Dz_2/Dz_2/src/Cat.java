public class Cat extends Animals implements Pet {
   //private String name;
    private String haveHair;
    public Cat(String haveHair,
               double height, double weight, String eyesColor) {
        super(height, weight, eyesColor );

        this.haveHair = haveHair;
     }
    @Override
    public String getName() {
        return "Барсик";
    }

    @Override
    public String getBreed() {
        return"Шотландский вислоухий";
    }

    @Override
    public String getVaccinations() {
        return "Да";
    }

    @Override
    public String getColor() {
        return "Серый";
    }

    @Override
    public String getBirthData() {
        return "2020.01.03";
    }


    public void info() {
        System.out.println("Имя :"+getName()+ " \n" + "Порода :" +getBreed() + ", Вакцинация :"  + getVaccinations() + ", Цвет шерсти :" + getColor()+ ", Дата рождения:" +getBirthData());
    }


    public void showAffection() {
        System.out.println("Я мурлыкаю");

    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString()+ "Имя = " +getName() +
                ", haveHair='" + haveHair + '\'' +

                '}';
    }
}
