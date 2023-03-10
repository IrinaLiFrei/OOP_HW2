package OOP_HW2;

public class Tiger extends Wild implements MakeSound {

    public Tiger(Double growth, Double weight, String eyeColour, String habitat, String dateOfFinding) {
        super(growth, weight, eyeColour, habitat, dateOfFinding);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("R-r-r-r-r!");
    }
}
