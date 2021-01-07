package SwimmingStudents;

import SwimmingStudents.*;

import java.lang.Math;

public class Worker extends People{
  

  
  private String strPosition;
  private static Double dblPay;

  

   public Worker(String firstName, String lastName, int Level, int intLane, String Position){
    super(firstName, lastName, Level, intLane);
    this.strPosition = Position;
    if(strPosition.equalsIgnoreCase("supervisor")) {
      dblPay = 18.00;
    }else if(strPosition.equalsIgnoreCase("lifeguard")) {
      dblPay = 14.00;
    }else if(strPosition.equalsIgnoreCase("instructor")) {
      dblPay = 16.00;
    }else if(strPosition.equalsIgnoreCase("instructor and lifeguard")) {
      dblPay = 17.00;
    }
  }

  public static double getPay() {
    return dblPay;
  }
  
  public String toString() {
    System.out.println("Your full name is: " + this.getFirstName() + " " + this.getLastName());
    if(strPosition.equalsIgnoreCase("instructor") || strPosition.equalsIgnoreCase("instructor and lifeguard")) {
      System.out.println("You are teaching level: " + this.getLevel());
      System.out.println("The are teaching in lane: " + this.getLane());
    }
    System.out.println("The positions you are qualified to work in are: " + strPosition);
    return "You are making this amount per hour in dollars: " + dblPay;
  }
}