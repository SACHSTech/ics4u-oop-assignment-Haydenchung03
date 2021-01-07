package SwimmingStudents;

import SwimmingStudents.*;

public class People {

  private String strFirstName;
  private String strLastName;
  private int intLevel;
  private int intLaneNumber;

  public People(String firstName, String lastName, int Level, int intLane) {
    this.strFirstName = firstName;
    this.strLastName = lastName;
    this.intLevel = Level;
    this.intLaneNumber = intLane;
  }

  public String getFirstName() {
    return strFirstName;
  }

  public String getLastName() {
    return strLastName;
  }

   public int getLevel() {
    return intLevel;
  }

  public int getLane() {
    return intLaneNumber;
  }
}