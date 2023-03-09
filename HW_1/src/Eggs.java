public class Eggs extends Food{
    private int inPackage;
    public Eggs(int inPackage, int bestBeforeDate, String name, int price,int quantity,String measure) {
        super(bestBeforeDate, name, price, quantity, measure);
        this.inPackage = inPackage;
    }

    @Override
    public String toString() {
        return "Яйцо{" + super.toString() +
                "В упаковке =" + inPackage + "Шт" +
                '}';
    }
}
