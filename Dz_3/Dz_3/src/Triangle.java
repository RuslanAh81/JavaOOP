public class Triangle extends NGon implements Area,Perimetr {

    public Triangle(double a, double b, double c) throws Exception {
        super(a, b, c);
        if (!((a + b) > c && (b + c) > a && (a + c) > b))
            throw new Exception("Треугольник с акими сторонами не может существовать");
        this.sides.add(a);
        this.sides.add(b);
        this.sides.add(c);
    }

    public double area() {
        double scale = Math.pow(10, 3);
        double halfP = perimetr() / 2;
        return Math.ceil(Math.sqrt(halfP * (halfP - this.sides.get(0)) * (halfP - this.sides.get(1)) * (halfP - this.sides.get(2)))*scale)/scale;
    }

    @Override
    public double perimetr() {
        return this.sides.get(0) + this.sides.get(1) + this.sides.get(2);
    }

    public String toString() {
        return "Треугольник{" +
                "Стороны = " + sides +" Площадью " + area()+ " и периметром " + perimetr() +
                '}';
    }
}