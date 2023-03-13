public class Dog extends Animals implements Pet{
    private String haveTraining;


    public Dog(String haveTraining,double height, double weight, String eyesColor) {
        super( height,  weight, eyesColor);
        this.haveTraining = haveTraining;
    }

    @Override
    public String getName() {
        return "Тотошка";
    }

    @Override
    public String getBreed() {
        return "Дворпес";
    }

    @Override
    public String getVaccinations() {
        return "Да";
    }

    @Override
    public String getColor() {
        return "Цветной";
    }

    @Override
    public String getBirthData() {
        return "2.12.2000";
    }

    @Override
    public void showAffection() {
        System.out.println("Я облизываю и пускаю слюни");
    }

    @Override
    public void makeSound() {
        System.out.println("Гав гав");
    }

    public void info() {
        System.out.println("Имя :"+getName()+ " \n" + "Порода :" +getBreed() + ", Вакцинация :"  + getVaccinations() + ", Цвет шерсти :" + getColor()+ ", Дата рождения:" +getBirthData());
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() + '\'' +
                '}';
    }
}
