public class Tiger extends Animals implements Wild {
    public Tiger(double height, double weight, String eyesColor) {
        super(height, weight, eyesColor);
    }


    @Override
    public String getHabitat() {
        return "Приамурье";
    }

    @Override
    public String getFindingData() {
        return "3.12.2023";
    }

    @Override
    public void makeSound() {
        System.out.println("РРРРР");
    }


    public void info() {
        System.out.println(super.toString() + " \n" + "Место обитания :" + getHabitat() + ", Дата нахождения :" + getFindingData());
    }
}
