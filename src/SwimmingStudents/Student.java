package SwimmingStudents;

import SwimmingStudents.*;

public class Student{

  private int intAge;
  private int intLevel;
  private int intLaneNumber;
  private String strParent;
  
  public Student(String firstName, String lastName, int Level, int intLane, String Parent, int Age){
    this.intAge = Age;
    this.intLevel = Level;
    this.intLaneNumber = intLane;
    this.strParent = Parent;
  }

  public int getAge() {
    return intAge;
  }

  public int intGetLevel(){
    return intLevel;
  }
  
  public int intGetLane() {
    return intLaneNumber;
  }

  public String getParentName() {
    return strParent; 
  }
}