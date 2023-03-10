package OOP_HW2;
import java.util.LinkedList;
import java.util.Scanner;

public class Console {
    public Integer number;
    private LinkedList<Animal> zoo = new LinkedList<>();

    public LinkedList<Animal> getZoo() {
        return zoo;
    }

    public void setZoo(LinkedList<Animal> zoo) {
        this.zoo = zoo;
    }

    public void setAction(LinkedList<Animal> zoo){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------WELCOME TO OUR ZOO!-----------" + "\n" +  
        "           1. See all animals at our zoo" + "\n" + 
        "           2. Add an animal to our zoo" + "\n" + 
        "           3. Remove an animal from our zoo" + "\n" + 
        "           4. View details of the specified animal at our zoo" + "\n" + 
        "           5. Listen to the sounds made by each animal at our zoo" + "\n" + 
        "           6. Listen to the sound made by the specified animal at our zoo" + "\n" +
        "           7. See the flight of birds if any" + "\n" +
        "           8. Get affection from pets if any" + "\n" +
        "           9. Train a dog if it is not trained" + "\n" +
        "           10. View details of all animals at our zoo" + "\n" +
        "---------Enter the number of what you want to do: ----------");
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
            if(number < 0 || number > 10) {
                System.out.println("Enter the number from 1 to 10");
                setAction(zoo);
            } 
        }else{
            System.out.println("Enter the number from 1 to 10");
            setAction(zoo);
        }
        Zoo z = new Zoo();
        if (number == 1){
            z.showZoo(zoo);
            setAction(zoo);    
        } 
        if (number == 2){
            z.addAnimal(zoo);
            setAction(zoo);
        }
        if (number == 3){
            z.removeAnimal(zoo);
            setAction(zoo);
        }
        if (number == 4){
            z.showAnimal(zoo);
            setAction(zoo);
        }
        if (number == 5){
            z.listenAll(zoo);
            setAction(zoo);
        }
        if (number == 6){
            z.listenOne(zoo);
            setAction(zoo);
        }
        if (number == 7){
            z.watchFlight(zoo);
            setAction(zoo);
        }
        if (number == 8){
            z.getAffection(zoo);
            setAction(zoo);
        }
        if (number == 9){
            z.trainDog(zoo);
            setAction(zoo);
        }
        if (number == 10){
            z.showAll(zoo);
            setAction(zoo);
        }
    scanner.close();
    }
}

