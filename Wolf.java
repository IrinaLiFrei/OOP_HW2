package OOP_HW2;

public class Wolf extends Wild implements MakeSound {

    private String packLeader;

    public void setPackLeader(String packLeader) {
        this.packLeader = packLeader;
    }

    public String getPackLeader() {
        return packLeader;
    }

    public Wolf(Double growth, Double weight, String eyeColour, String habitat, String dateOfFinding,
            String packLeader) {
        super(growth, weight, eyeColour, habitat, dateOfFinding);
        this.packLeader = packLeader;

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " --> growth: " + growth +
                ", weight: " + weight +
                ", colour of eyes: " + eyeColour +
                ", habitat: " + habitat +
                ", date of finding: " + dateOfFinding +
                ", pack leader or not: " + packLeader;
    }

    @Override
    public void makeSound() {
        System.out.println("Owoooooooooo!");
    }

}
