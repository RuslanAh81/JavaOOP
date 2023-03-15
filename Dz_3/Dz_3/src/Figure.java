public abstract class Figure implements Comparable<Figure>{
    public  abstract double area();
    public  abstract double perimetr();

    Figure(){

    }
    public int compareTo(Figure o) {
        return Double.compare(area(),o.area());
    }

    @Override
    public String toString() {
        return "Figure{}";
    }
}
