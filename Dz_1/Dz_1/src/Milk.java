public class Milk extends Food {
    private int fatPercent;
    public Milk(int fatPercent,int bestBeforeDate, String name, int price,int quantity,String measure) {
        super(bestBeforeDate, name, price, quantity, measure);
        this.fatPercent = fatPercent;
    }
    public String toString() {
        return "Молоко {" + super.toString() + "процент жирности " + fatPercent + "%";
    }
}
