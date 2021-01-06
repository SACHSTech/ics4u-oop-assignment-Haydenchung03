package SwimmingStudents;

import SwimmingStudents.*;
import java.lang.Math;

public class Supervisor {

  
  private double dblPay;

  public Supervisor(String firstName, String lastName, double Pay) {
    this.strFirstName = firstName;
    this.strLastName = lastName;
    this.dblPay = Pay;
  }

   public String getFirstName(){
    return strFirstName;
  }

  public String getLastName(){
    return strLastName;
  }

  public double dblGetPay() {
    return Math.round(dblPay * 100.0) / 100.0;
  }
}
