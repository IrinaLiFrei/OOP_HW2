package OOP_HW2;

import java.util.LinkedList;
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Animal caty = new Cat(15.5, 10.0, "green", "Pantera", "Sphynx", "all", "grey", "12.12.2012", "hairless");
        Animal tigy = new Tiger(70.0, 120.0, "yellow", "tropical forest", "10.10.2010");
        Animal dogy = new Dog(22.0, 40.0, "brown", "Rox", "Labrador", "null", "black", "20.10.2022", "trained");
        Animal wolfy = new Wolf(45.7, 88.8, "blue", "forest", "01.05.2020", "leader");
        Animal storky = new Stork(15.0, 10.5, "black", null);

        Console cons = new Console();
        LinkedList<Animal> zoo = cons.getZoo();
        zoo.add(caty);
        zoo.add(tigy);
        zoo.add(dogy);
        zoo.add(wolfy);
        zoo.add(storky);

        cons.setAction(zoo);

    }

    public void showZoo(LinkedList<Animal> zoo) {
        System.out.println("ANIMALS AT OUR ZOO:");
        for (int i = 0; i < zoo.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(zoo.get(i).getClass().getSimpleName());
        }
    }

    public void showAll(LinkedList<Animal> zoo) {
        System.out.println("ANIMALS AT OUR ZOO:");
        for (int i = 0; i < zoo.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(zoo.get(i));
        }
    }

    public void showAnimal(LinkedList<Animal> zoo) {
        Console cons = new Console();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < zoo.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(zoo.get(i).getClass().getSimpleName());
        }
        System.out.println("Enter the number of animal you want to view: ");
        if (sc.hasNextInt()) {
            Integer number = sc.nextInt();
            if (number > zoo.size() + 1 || number < 0) {
                System.out.println("Try again!");
                showAnimal(zoo);
            } else {
                System.out.println(zoo.get(number - 1));
                cons.setAction(zoo);
            }
        } else {
            System.out.println("Try again!");
            showAnimal(zoo);
        }
        sc.close();
    }

    public void addAnimal(LinkedList<Animal> zoo) {
        Console cons = new Console();
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "What animal do you want to add? \n 1. Wild animal \n 2. Pet \n 3. Bird \n Choose the number:");
        if (sc.hasNextInt()) {
            Integer number = sc.nextInt();
            if (number == 1) {
                System.out.println("Growth: ");
                Double growth = sc.nextDouble();
                System.out.println("Weight: ");
                Double weight = sc.nextDouble();
                System.out.println("Colour of eyes: ");
                String eyeColour = sc.next();
                System.out.println("Habitat: ");
                String habitat = sc.next();
                System.out.println("Date of finding: ");
                String dateOfFinding = sc.next();
                Animal wild = new Wild(growth, weight, eyeColour, habitat, dateOfFinding);
                zoo.add(wild);
                System.out.println("THE ANIMAL WAS SUCCESSFULLY ADDED TO OUR ZOO.");
                cons.setAction(zoo);
            }
            if (number == 2) {

                System.out.println("Growth: ");
                Double growth = sc.nextDouble();
                System.out.println("Weight: ");
                Double weight = sc.nextDouble();
                System.out.println("Colour of eyes: ");
                String eyeColour = sc.next();
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Breed: ");
                String breed = sc.next();
                System.out.println("Vaccinations: ");
                String vaccinations = sc.next();
                System.out.println("Colour of fur: ");
                String furColour = sc.next();
                System.out.println("Date of birth: ");
                String dateOfBirth = sc.next();
                Animal pet = new Pet(growth, weight, eyeColour, name, breed, vaccinations, furColour, dateOfBirth);
                zoo.add(pet);
                System.out.println("THE ANIMAL HAS BEEN SUCCESSFULLY ADDED TO OUR ZOO.");
                cons.setAction(zoo);
            }
            if (number == 3) {
                System.out.println("Growth: ");
                Double growth = sc.nextDouble();
                System.out.println("Weight: ");
                Double weight = sc.nextDouble();
                System.out.println("Colour of eyes: ");
                String eyeColour = sc.next();
                System.out.println("Flight altitude: ");
                Integer flightAltitude = sc.nextInt();
                Animal bird = new Bird(growth, weight, eyeColour, flightAltitude);
                zoo.add(bird);
                System.out.println("THE BIRD HAS BEEN SUCCESSFULLY ADDED TO OUR ZOO.");
                cons.setAction(zoo);
            } else {
                System.out.println("Enter the number from 1 to 3");
                addAnimal(zoo);
            }
        } else {
            System.out.println("Enter the number from 1 to 3");
            addAnimal(zoo);
        }
        sc.close();
    }

    public void removeAnimal(LinkedList<Animal> zoo) {
        Console cons = new Console();
        showZoo(zoo);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the number of the animal you want to remove: ");
        if (sc.hasNextInt()) {
            Integer number = sc.nextInt();
            if (number > zoo.size() + 1 || number < 0) {
                System.out.println("Try again!");
                removeAnimal(zoo);
            } else {
                zoo.remove(zoo.get(number - 1));
                System.out.printf("=======ANIMAL No. %d HAS BEEN SUCCESSFULLY REMOVED.", number);
                System.out.println();
                cons.setAction(zoo);
            }
        } else {
            System.out.println("Try again!");
            removeAnimal(zoo);
        }
        sc.close();
    }

    public void listenAll(LinkedList<Animal> zoo) {
        for (Animal animal : zoo)
            if (animal instanceof MakeSound) {
                System.out.print(animal.getClass().getSimpleName() + ": ");
                ((MakeSound) animal).makeSound();
            }
    }

    public void listenOne(LinkedList<Animal> zoo) {
        Console cons = new Console();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < zoo.size(); i++) {
            System.out.print(i + 1 + ". ");
            System.out.println(zoo.get(i).getClass().getSimpleName());
        }
        System.out.println("Enter the number of the animal you want to listen to: ");
        if (sc.hasNextInt()) {
            Integer number = sc.nextInt();
            if (number > zoo.size() || number < 0) {
                System.out.println("Try again!");
                listenOne(zoo);
            } else {
                if (((MakeSound) zoo.get(number - 1)) instanceof MakeSound) {
                    ((MakeSound) zoo.get(number - 1)).makeSound();
                    cons.setAction(zoo);
                } else {
                    System.out.println("Silence is gold");
                }
            }
        } else {
            System.out.println("Try again!");
            listenOne(zoo);
        }
    sc.close();
    }


    public void watchFlight(LinkedList<Animal> zoo) {
        for (Animal animal : zoo)
            if (animal instanceof Fly) {
                ((Fly) animal).fly();
            }
    }

    public void getAffection(LinkedList<Animal> zoo) {
        for (Animal animal : zoo)
            if (animal instanceof ShowAffection) {
                System.out.print(animal.getClass().getSimpleName() + ": ");
                ((ShowAffection) animal).showAffection();
            }
    }

    public void trainDog(LinkedList<Animal> zoo) {
        for (Animal animal : zoo)
            if (animal instanceof Train) {
                ((Train) animal).train();

            }
    }
}
