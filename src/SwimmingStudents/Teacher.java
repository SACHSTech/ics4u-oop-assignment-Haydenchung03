package SwimmingStudents;

import SwimmingStudents.*;

public class Teacher{
  
  private String strFirstName;
  private String strLastName;
  private int intLevel;
  private int intLaneNumber;

  public Teacher(String firstName, String lastName, int Level, int intLane){
    this.strFirstName = firstName;
    this.strLastName = lastName;
    this.intLevel = Level;
    this.intLaneNumber = intLane;
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
}