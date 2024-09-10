public class Student {
    private static int numOfStudents = 0;

    // Create a constructor for our new object
    public Student () {
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    // Give our student class a few fields
    String firstName;
    String lastName;
    double gpa;
    String major;
    int age;
    boolean onProbation;
}
