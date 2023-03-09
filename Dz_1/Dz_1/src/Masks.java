public class Masks extends ChildensGoods {
    public Masks(int minAge,String hypo,String name, int price,int quantity,String measure) {
        super(minAge, hypo, name, price, quantity, measure);

    }

    @Override
    public String toString() {
        return "Маска {" + super.toString();
    }
}
