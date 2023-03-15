import java.util.ArrayList;
import java.util.List;

public abstract class NGon extends Figure{
    protected List<Double> sides = new ArrayList<>();
    protected NGon(double... sides) throws Exception {
        for (double side: sides) {
            if (side <=0) throw new Exception("Многоугольник с такими сторонами не может существовать");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " и периметром " + perimetr();
    }
}
