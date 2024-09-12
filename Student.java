package mystudent;

public class Student {
  public static void sayHello() {
      System.out.println("\n Hello from student class. I am a static method and I belong to the Student class!\n");
  }

  public void sayHi() {
      System.out.println("\n Hi there I must be from an object because I am not static");
  }
}
