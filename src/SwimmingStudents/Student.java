package SwimmingStudents;

import SwimmingStudents.*;

public class Student{

  
  private int intLevel;
  private int intLaneNumber;
  private String strParent;
  
  public Student(String firstName, String lastName, int Level, int intLane, String Parent){
    this.strFirstName = firstName;
    this.strLastName = lastName;
    this.intLevel = Level;
    this.intLaneNumber = intLane;
    this.strParent = Parent;
  }

  public String getFirstName(){
    return strFirstName;
  }

  public String getLastName(){
    return strLastName;
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