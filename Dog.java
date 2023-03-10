package OOP_HW2;


public class Dog extends Pet implements ShowAffection, MakeSound, Train {

    private String trainedOrNot;

    public String getTrainedOrNot() {
        return trainedOrNot;
    }

    public void setTrainedOrNot(String trainedOrNot) {
        this.trainedOrNot = trainedOrNot;
    }

    public Dog(Double growth, Double weight, String eyeColour, String name, String breed, String vaccinations,
            String furColour, String dateOfBirth, String trainedOrNot) {
        super(growth, weight, eyeColour, name, breed, vaccinations, furColour, dateOfBirth);
        this.trainedOrNot = trainedOrNot;
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
                ", date of birth: " + dateOfBirth +
                ", trained/not trained: " + trainedOrNot;
    }

    // public void getReply(){
    // String reply = "";
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Is your dog trained or not? y or n: ");
    // if (scan.hasNextLine()){
    // reply = scan.nextLine();
    // if (reply.equals("y") || reply.equals("yes")){
    // this.trainedOrNot = "trained";
    // }
    // if(reply.equals("n") || reply.equals("no")){
    // this.trainedOrNot = "not trained";
    // }
    // }else{
    // System.out.println("You should print 'y' if trained, or 'n' if not
    // trained.");
    // getReply();
    // }

    // }

    public void train() {
        if (trainedOrNot.equals("trained")) {
            System.out.println("The dog is already trained.");
        } else {
            System.out.println("The dog has been trained!");
            trainedOrNot = "trained";
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Woof, woof, woof!");
    }

    @Override
    public void showAffection() {
        System.out.println("I love you!");
    }

}
