package OOP_HW2;

import java.util.Scanner;

public class Stork extends Bird implements Fly, MakeSound {

    public Stork(Double growth, Double weight, String eyeColour, Integer flightAltitude) {
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
        System.out.print(getClass().getSimpleName() + ": ");
        System.out.printf("I'm flying at %d meters!", getFlightInMet());
        System.out.println();
    }

    @Override
    public void makeSound() {
        System.out.println("Croak, croak, croak...");
    }
}