public class BabyPacifier extends ChildensGoods {
    public BabyPacifier(int minAge,String hypo,String name, int price,int quantity,String measure){
        super(minAge, hypo, name, price, quantity, measure);
    }

    @Override
    public String toString() {
        return "Соска " + super.toString();
    }
}
