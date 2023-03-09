public class Drinks extends Product{
    private double volume;
    String unitVolume;
    public Drinks(double volume,String unitVolume, String name, int price,int quantity,String measure) {
        super(name, price, quantity, measure);
        this.volume = volume;
        this.unitVolume = unitVolume;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Объем = " + unitVolume +
                '}';
    }
}
