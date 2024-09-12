package myanimals;

public class Dog extends Animal{
    // the dog class is a subclass of Animal.
    // so it should have all the methods form the Animal class
    // available to it.
    // This is polymorphism - this word means "many shapes"
    // when used here, by a Dog object, this method that has the same name
    // as the method in the superclass, takes another shape
    public void animalSound() {
        System.out.println("The sound of the Dog class used by the Dog Object - Bark!");
    }
}
