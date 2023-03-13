public class Wolf extends Animals implements Wild {
    private String leaderOfPack;  //Вожак стаи

    public Wolf(String leaderOfPack, double height, double weight, String eyesColor) {
        super(height, weight, eyesColor);
        this.leaderOfPack = leaderOfPack;

    }

    @Override
    public String getHabitat() {
        return "Леса России";
    }

    @Override
    public String getFindingData() {
        return "3.12.2023";
    }

    @Override
    public void makeSound() {
        System.out.println("гыыы афф");
    }

    public void info() {
        System.out.println(super.toString() + " \n" + "Место обитания :" + getHabitat() + ", Дата нахождения :" + getFindingData() + ", Вожак стаи :" + leaderOfPack);
    }
}