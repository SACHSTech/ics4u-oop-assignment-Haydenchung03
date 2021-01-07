package SwimmingStudents;

import SwimmingStudents.*;
import java.lang.Math;

public class Worker{
  

  private int intLevel;
  private int intLaneNumber;
  private String strPosition;
  

  public Teacher(int Level, int intLane, String position) {
    
    this.intLevel = Level;
    this.intLaneNumber = intLane;
    this.strPosition = position;
  }

  public int intGetLevel() {
    return intLevel;
  }
  
  public int intGetLane() {
    return intLaneNumber;
  }

  public String getPosition() {
    return strPosition;
  }
}