public abstract class Bird extends Animals implements Fly {
    private int flightAltitude; //Высота полета

    public Bird(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public double getFlightAltitude() {
        return flightAltitude;
    }

    public void fly() {
        System.out.println("Я лечу на " + flightAltitude + "метрах ");
    }

}
