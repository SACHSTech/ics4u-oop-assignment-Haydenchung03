package SwimmingStudents;

import SwimmingStudents.*;

public class Parents extends People {

  private double dblPrice;

  public Parents(String firstName, String lastName, int Level, int intLane){
    super(firstName, lastName, Level, intLane);
    if(Level >= 5 && Level <= 7 ){
      dblPrice = 400.0;
    }else if(Level == 9 && Level == 10 ){
      dblPrice = 450.0;
    }
  }

  public String toString() {
    System.out.println("Your child's name is: " + this.getFirstName() + " " + this.getLastName());
    System.out.println("Your child's level is: " + this.getLevel());
    System.out.println("Your child is in lane: " + this.getLane());
    return "The price of this course is: " + dblPrice;
  }
}