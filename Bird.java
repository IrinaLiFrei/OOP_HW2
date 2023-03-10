package OOP_HW2;


public class Bird extends Animal {
    protected Integer flightAltitude;
    private Integer flightInMet;

    public Bird(Double growth, Double weight, String eyeColour, Integer flightAltitude) {
        super(growth, weight, eyeColour);
        this.flightAltitude = flightAltitude;
    }

    public void setFlightInMet(Integer flightInMet) {
        this.flightInMet = flightInMet;
    }

    public Integer getFlightInMet() {
        return flightInMet;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " --> growth: " + growth +
                ", weight: " + weight +
                ", colour of eyes: " + eyeColour +
                ", flight atitude: " + flightAltitude + " meter(s)";
    }

    public void fly() {
    }

    public void makeSound() {

    }

}
