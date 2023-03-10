package OOP_HW2;

public class Wild extends Animal {
    protected String habitat;
    protected String dateOfFinding;

    public Wild(Double growth, Double weight, String eyeColour, String habitat, String dateOfFinding) {
        super(growth, weight, eyeColour);
        this.habitat = habitat;
        this.dateOfFinding = dateOfFinding;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " --> growth: " + growth +
                ", weight: " + weight +
                ", colour of eyes: " + eyeColour +
                ", habitat: " + habitat +
                ", date of finding: " + dateOfFinding;
    }
}
