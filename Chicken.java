package OOP_HW2;

import java.util.Scanner;

public class Chicken extends Bird implements Fly, MakeSound{

    public Chicken(Double growth, Double weight, String eyeColour, Integer flightAltitude) {
        super(growth, weight, eyeColour, flightAltitude);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void fly() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a flight altitude: ");
        if (sc.hasNextInt()) {
            setFlightInMet(sc.nextInt());
        } else {
            System.out.println("######### You should enter a number. Try again.");
            fly();
        }
        System.out.printf("I'm flying at %d meters!", getFlightInMet());
        sc.close();
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck, cluck...");
    }
}