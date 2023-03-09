public class Bread extends Food {
    private String flourType;
    public Bread(String flourType, int bestBeforeDate, String name, int price,int quantity,String measure){
        super(bestBeforeDate, name, price, quantity, measure);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return "Хлеб {" + super.toString() +
                "Тип муки = '" + flourType + '\'' +
                '}';
    }
}
