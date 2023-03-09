public class Lemonade extends Drinks{
    public Lemonade(double volume,String unitVolume, String name, int price,int quantity,String measure){
        super(volume,unitVolume, name, price, quantity, measure);

    }

    @Override
    public String toString() {
        return "Лимонад {" + super.toString();


    }

}
