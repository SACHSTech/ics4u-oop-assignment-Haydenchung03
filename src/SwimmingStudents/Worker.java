package SwimmingStudents;

import SwimmingStudents.*;

public class Worker{
  

  
  private String strPosition;
  

  public Worker(int Level, int intLane, String position) {
    super(Level, intLane);
    this.strPosition = position;
  }

  public String getPosition() {
    return strPosition;
  }
}