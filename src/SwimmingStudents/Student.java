package SwimmingStudents;

import SwimmingStudents.*;

public class Student extends People {

  private int intAge;
  
  public Student(String firstName, String lastName, int Level, int intLane, int Age){
    super(firstName, lastName, Level, intLane);
    this.intAge = Age;
  }

  public String toString() {
    return "Your full name is: " + this.getFirstName() + " " + this.getLastName() + " Your Level is: " + this.getLevel() + " The Lane you are swimming is: " + this.getLane() + " Your Age is: " + this.intAge;
  }
}