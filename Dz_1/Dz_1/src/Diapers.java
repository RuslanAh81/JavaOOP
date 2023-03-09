public class Diapers extends Hygiene{
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Diapers(int size, int minWeight, int maxWeight, String type, int numbInPackage, String name, int price,int quantity,String measure){
        super(numbInPackage, name, price, quantity, measure);
        this.size =size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
        numbInPackage= numbInPackage;
        name = name;
        price = price;
    }

    @Override
    public String toString() {
        return "Подгузник {" + super.toString() +
                "размер= " + size +
                ", минимальны вес = " + minWeight +
                ", максимальный вес = " + maxWeight +
                ", Тип ='" + type + '\'' +
                '}';
    }
}
