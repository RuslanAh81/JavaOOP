public class Rectangle extends NGon implements Perimetr,Area {

    public Rectangle(double a, double b) throws Exception {
        super(a, b);
        this.sides.add(a);
        this.sides.add(b);

    }


    @Override
    public double perimetr() {

        return 2 * (this.sides.get(0) + this.sides.get(1));
    }

    public double area() {
        return this.sides.get(0) + this.sides.get(1);
    }

    public String toString() {
        return "Прямоугольник {" +
                "Стороны = " + sides +" Площадью " + area() + " и периметром " + perimetr()+
                '}';
    }
}