/* Angelo Andrade
* 09/19/24
* Main.java
* Driver file for Animal and Hyena class usage.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
            throws IOException {
    System.out.println("\n Welcome to my Zoo Program!");

    // Open the arriving animals file.
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(("C:\\Users\\BE218\\ideaProjects\\arrivingAnimals\\arrivingAnimals.txt")));
            String myLine;

            // Read the file one line at a time
            while ((myLine = bufferedReader.readLine()) != null) {
                System.out.println(myLine);
            }
        }catch(IOException e){
                throw new RuntimeException(e);
            }

    //Create an Animal object
    Animal myAnimalObject = new Animal();

    myAnimalObject.setAge(4);

    // Use or new Animal object.
    System.out.println("\n My animal age is: " + myAnimalObject.getAge() + " years old.");

    // Create a Hyena object
    Hyena myNewHyena = new Hyena();
    myNewHyena.setAge(7);

    // Output the age of our Hyena
    System.out.println("\n The age of our Hyena is: " + myNewHyena.getAge() + " years old.");

    // Create a Lion object.
    Lion myNewLion = new Lion();
    // Make the lion 12 years old.
    myNewLion.setAge(12);

    // Output the age of our lion
    System.out.println("\n The age of our Lion is: " + myNewLion.getAge() + " years old.");


    // Output the number of Animals
    System.out.println("\n The number of animals are: " + Animal.numOfAnimals);

    }
}

