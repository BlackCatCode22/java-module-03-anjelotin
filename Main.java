/*
* Angelo Andrade
* 9/12/24
* Main.java
*/
import mystudent.Student;
import mystudent.App;
import myanimals.Animal;
import myanimals.Cat;
import myanimals.Dog;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n Hello and welcome from the Main \n");

        // Create a Student object.
        Student student = new Student();

        // Create an object from a runnable class.
        App app = new App();

        // Use a method from the student class
        // I know that I have a static method on the Student Class.
        // and, I know to call a static class method.
        Student.sayHello();

        // Call a method that belongs to the student object
        student.sayHi();

        // Output the number of animals
        System.out.println("\n The number of animals is " + Animal.numOfAnimals);

        // Create cat object
        Cat cat = new Cat();
        // use a method that is available to the ca object named cat
        System.out.println("\n this sound is coming from the Cat object called cat...");
        cat.animalSound();

        // Create Dog object
        Dog dog = new Dog();
        // Use a method that is available to the dog object named dog
        System.out.println("\n this sound is coming from the Dog  object called dog...");
        dog.animalSound();

        System.out.println("The number of animals is: " + Animal.numOfAnimals);
    }
}