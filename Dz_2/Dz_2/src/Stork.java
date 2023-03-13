public class Stork extends Bird implements Fly {
    public Stork(int flightAltitude) {
        super(flightAltitude);

    }

    public void info() {
        System.out.println("Я журавль");

    }

    public void sound() {
        System.out.println(" Курлык курлык");
    }

    public void fly() {
        System.out.println(" я летаю на " + getFlightAltitude() + " метрах");
    }

    @Override
    public String toString() {
        return "Stork{}";
    }
}
