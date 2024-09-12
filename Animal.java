package myanimals;

public class Animal {
    // There is not a "static" keyword here, so... this method
    // will be available to Animal objects
    // Create a static member named numOfAnimal
   public static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
    }

    public void animalSound() {

        System.out.println("\n A sound from the animal class : The animal makes a sound");
    }
}
