package OOP_HW2;

public class Pet extends Animal {
    protected String name;
    protected String breed;
    protected String vaccinations;
    protected String furColour;
    protected String dateOfBirth;

    public Pet(Double growth, Double weight, String eyeColour, String name, String breed, String vaccinations,
            String furColour, String dateOfBirth) {
        super(growth, weight, eyeColour);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.furColour = furColour;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " --> name: " + name +
                ", breed: " + breed +
                ", growth: " + growth +
                ", weight: " + weight +
                ", colour of eyes: " + eyeColour +
                ", vaccinations: " + vaccinations +
                ", colour of fur: " + furColour +
                ", vaccinations: " + vaccinations +
                ", date of birth: " + dateOfBirth;
    }

    public void showAffection() {
    }

}
