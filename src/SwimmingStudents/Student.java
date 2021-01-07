package SwimmingStudents;

import SwimmingStudents.*;

public class Student extends People extends SwimClass{

  private int intAge;
  
  public Student(String firstName, String lastName, int Level, int intLane, int Age){
    super(firstName, lastName, Level, intLane);
    this.intAge = Age;
  }

  public String toString() {
    return this.getFirstName() + this.getLastName();
  }
}