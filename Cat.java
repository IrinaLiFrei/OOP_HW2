package OOP_HW2;

public class Cat extends Pet implements ShowAffection, MakeSound {

    private String hair;

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getHair() {
        return hair;
    }

    public Cat(Double growth, Double weight, String eyeColour, String name, String breed, String vaccinations,
            String furColour, String dateOfBirth, String hair) {
        super(growth, weight, eyeColour, name, breed, vaccinations, furColour, dateOfBirth);
        this.hair = hair;

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
                ", hair: " + hair +
                ", colour of fur: " + furColour +
                ", vaccinations: " + vaccinations +
                ", date of birth: " + dateOfBirth;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow... Meow, meow, meow!");
    }

    @Override
    public void showAffection() {
        System.out.println("Murrrrrrrrrrrrr...");
    }

}
