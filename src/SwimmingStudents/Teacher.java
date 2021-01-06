package SwimmingStudents;

import SwimmingStudents.*;
import java.lang.Math;

public class Teacher{
  
  
  private int intLevel;
  private int intLaneNumber;
  private double dblPay;

  public Teacher(String firstName, String lastName, int Level, int intLane, double Pay){
    this.strFirstName = firstName;
    this.strLastName = lastName;
    this.intLevel = Level;
    this.intLaneNumber = intLane;
    this.dblPay = Pay;
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

  public double dblGetPay() {
    return Math.round(dblPay * 100.0) / 100.0;
  }
}