package OOP_HW2;

import java.util.LinkedList;

public class Main {
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

}
