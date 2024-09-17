/* Angelo Andrade
* 9/17/24
* MainClassPractice.java
*/

public class MainClassPractice {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my OOP Class Practice Program!\n");

        // Create a couple Dog objects
        // with an empty arguments ("no args")
        Dog mydog = new Dog();
        Dog anotherDog = new Dog();

        // Create a Dog with a String name
        Dog aDog = new Dog("spot");

        // Output the new Dog object's name
        System.out.println("\n The new dog's name is: " + aDog.getName());

        // Create a new dog with an int age.
        Dog fourthDog = new Dog(33);

        // Output the fourth Dog object's age.
        System.out.println("\n The new dog's age is: " + fourthDog.getAge());

        // And... finally create fifth and last dog
        Dog fifthDog = new Dog("my new dog's name", 7);

        // Validate it.
        System.out.println("my last dog's " + fifthDog.getName() + " and age is: " + fifthDog.getAge());

        // Give our dog a birthday (add year to its age)
        fifthDog.setAge(fifthDog.getAge() + 1);
         // validate it.
        System.out.println("\n my dog's, who is named: " + fifthDog.getName() + ", had a birthday and age is now: " + fifthDog.getAge());
    }
}