public class ToiletPaper extends Hygiene{
    private int numbOfLayers;
    public ToiletPaper(int numbOfLayers, int numbInPackage, String name, int price,int quantity,String measure) {
        super(numbInPackage, name, price, quantity, measure);
        this.numbOfLayers = numbOfLayers;
    }

    @Override
    public String toString() {
        return "Туалетная бумага {" + super.toString() +
                "количество слоев = " + numbOfLayers +

                '}';
    }
}
