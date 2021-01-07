package SwimmingStudents;

import SwimmingStudents.*;

public class Student extends People {

  private int intAge;
  
  public Student(String firstName, String lastName, int Level, int intLane, int Age){
    super(firstName, lastName, Level, intLane);
    this.intAge = Age;
  }

  public String toString() {
    System.out.println("Your full name is: " + this.getFirstName() + " " + this.getLastName());
    System.out.println("Your Level is: " + this.getLevel());
    System.out.println("The Lane you are swimming is: " + this.getLane()); 
    return " Your Age is: " + this.intAge;
  }
}