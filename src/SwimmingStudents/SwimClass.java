package SwimmingStudents;

import SwimmingStudents.*;

public class SwimClass {
   
  private int intLevel;
  private int intLaneNumber;

  public SwimClass(int Level, int intLane) {
    this.intLevel = Level;
    this.intLaneNumber = intLane;
  }
  
  public int getLevel() {
    return intLevel;
  }

  public int getLane() {
    return intLaneNumber;
  }

}