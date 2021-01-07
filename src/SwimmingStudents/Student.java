package SwimmingStudents;

import SwimmingStudents.*;

public class Student{

  private int intAge;
  
  public Student(String firstName, String lastName, int Level, int intLane, int Age){
    super(firstName, lastName, Level, intLane);
    this.intAge = Age;
  }

  public int getAge() {
    return intAge;
  }
}