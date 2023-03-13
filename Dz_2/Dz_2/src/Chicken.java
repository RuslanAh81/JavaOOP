public class Chicken extends Bird implements Fly{
   public Chicken(int flightAltitude){
        super(flightAltitude);
    }
    public void info(){
        System.out.println("Я курица ");
    }


    public void sound() {
        System.out.println("Кукареку");

    }


    @Override
    public String toString() {
        return "Chicken{}";
    }

    public void fly(){
        System.out.println("Я лечу на " +getFlightAltitude() + " метрах ");
    }


}

