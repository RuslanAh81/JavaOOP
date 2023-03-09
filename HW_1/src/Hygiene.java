public class Hygiene extends Product{
    private int numbInPackage;
    public Hygiene(int numbInPackage, String name, int price,int quantity,String measure) {
        super(name, price, quantity, measure);
        this.numbInPackage = numbInPackage;
    }

    @Override
    public String toString() {
        return "Предметы гигиены {" + super.toString()+
                "количество в упаковке = " + numbInPackage +
                '}';
    }
}
