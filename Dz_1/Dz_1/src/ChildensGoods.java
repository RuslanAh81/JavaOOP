public class ChildensGoods extends Product{
    private int minAge;
    private String hypo;
    public ChildensGoods(int minAge,String hypo,String name, int price,int quantity,String measure) {
        super(name, price, quantity, measure);
        this.minAge = minAge;
        this.hypo= hypo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "минимальный возраст = " + minAge +
                ", Гипоаллергенность = '" + hypo + '\'' +
                '}';
    }
}
