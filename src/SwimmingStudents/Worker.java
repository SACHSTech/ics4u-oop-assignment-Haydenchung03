package SwimmingStudents;

import SwimmingStudents.*;

import java.lang.Math;

public class Worker extends People{
  

  
  private String strPosition;
  private Double dblPay;

  

   public Worker(String firstName, String lastName, int Level, int intLane, Double Pay, String Position){
    super(firstName, lastName, Level, intLane);
    this.dblPay = Pay;
    this.strPosition = Position;
    if(strPosition.equalsIgnoreCase("supervisor")) {
      dblPay = 18;
    }
  }

  public String toString() {
    System.out.println("Your full name is: " + this.getFirstName() + " " + this.getLastName());
    System.out.println("You are teaching level: " + this.getLevel());
    System.out.println("The are teaching in lane: " + this.getLane());
    System.out.println("The positions you are qualified to work in are: " + strPosition);
    System.out.println("You are making this amount per hour in dollars: " + dblPay);
    return " Your Age is: " + this.intAge;
  }
}