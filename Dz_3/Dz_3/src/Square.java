public class Square extends Rectangle implements Perimetr,  Area {

    public Square(double a) throws Exception{
        super(a,a);
    }

    @Override
    public String toString() {
        return "Квадрат{" +
                "Стороны = " + sides + " Площадью " + area() +  " и периметром " + perimetr()+
                '}';
    }
}