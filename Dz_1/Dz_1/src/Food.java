public class Food extends Product{
    private int bestBeforeDate;
    public Food(int bestBeforeDate, String name, int price,int quantity,String measure) {
        super(name, price, quantity, measure);
        this.bestBeforeDate = bestBeforeDate;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Срок годности = " + bestBeforeDate +
                '}';
    }
}
