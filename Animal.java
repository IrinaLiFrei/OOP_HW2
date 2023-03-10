package OOP_HW2;

public abstract class Animal {

    protected Double growth;
    protected Double weight;
    protected String eyeColour;

    public Animal(Double growth, Double weight, String eyeColour) {
        this.growth = growth;
        this.weight = weight;
        this.eyeColour = eyeColour;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " --> growth: " + growth +
                ", weight: " + weight +
                ", colour of eyes: " + eyeColour;
    }

    public void makeSound() {

    }
}
