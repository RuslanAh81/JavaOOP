import java.util.concurrent.ExecutionException;

public class Circle extends Figure {
    private double r;

    public Circle(double r) throws Exception {
        this.r = r;
        if (r<=0){
            throw new Exception("Радиус должен быть больше 0");
        }

    }

    public double area() {
        double scale = Math.pow(10,3);
        return Math.ceil((r * r * Math.PI)*scale)/scale;
    }

    public double perimetr() {
        return 2 * Math.PI * r;
    }

    public String toString() {
        return ("Круг{" +
                "Радиус = " + r +" Площадью "+area() +
                '}');
    }
}