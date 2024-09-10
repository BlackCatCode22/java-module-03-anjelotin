/* Angelo Andrade
* 9/10/24
* App.java
*/


public class App {
    public static void main(String[] args) {

        System.out.println("\n Welcome to classes and object-oriented programing");

        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        Student mySecondStudent = new Student();
        mySecondStudent.firstName = "Pam";
        mySecondStudent.lastName = "Beasly";
        mySecondStudent.major = "art";
        mySecondStudent.gpa = 2.5;
        mySecondStudent.age = 23;
        mySecondStudent.onProbation = true;

        System.out.println(myStudent.gpa);
        System.out.println(mySecondStudent.firstName);

        Phone myPhone = new Phone();
        myPhone.model = "iphone 11";
        myPhone.brand = "apple";
        myPhone.numOfCameras = 2;
        myPhone.latestModel = false;
        myPhone.size = 6.0;

        System.out.println("\n My new phone has " + myPhone.numOfCameras + " cameras!");

       // Create two more students
        Student anotherStudent = new Student();
        Student oneMoreStu = new Student();

        anotherStudent.gpa = 3.0;
        anotherStudent.age = 20;
        anotherStudent.major = "math";
        anotherStudent.firstName = "Adam";
        anotherStudent.lastName = "Doe";
        anotherStudent.onProbation = false;

        System.out.println(anotherStudent.firstName);

        oneMoreStu.firstName = "Sara";
        oneMoreStu.lastName = "Doe";
        oneMoreStu.major = "Biology";
        oneMoreStu.age = 25;
        oneMoreStu.gpa = 3.5;
        oneMoreStu.onProbation = false;


        // How many students?
        System.out.println("\n There are " + Student.getNumOfStudents() + " Students objects created!");



    // Create Cat
        Cat myCat = new Cat();

        myCat.name = "Binky";
        myCat.age = 1;
        myCat.livesRemaining = 9;
        System.out.println("\n My cat is named " + myCat.name);

    // Create a dog named Fido
        Dog myDog = new Dog();
        myDog.age = 2;
        myDog.name = "Fido";
        myDog.bark();

    }
}