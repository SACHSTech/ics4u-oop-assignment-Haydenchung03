package SwimmingStudents;

import SwimmingStudents.*;

public class Parent extends People {

  // Class Variables
  private static double dblPrice = 0;

  /**
  * Constructor: Creates a new parent Instance
  * @param firstName - person's first name
  * @param lastName - person's last Name
  * @param Level - person's level in Swimming 
  * @param intLane - person's lane number
  */
  public Parent(String firstName, String lastName, int Level, int intLane) {
    super(firstName, lastName, Level, intLane);
    // Conditions to see the value of dblPrice
    if(Level >= 1 && Level <= 7 ) {
      dblPrice = 400.0;
    }else if(Level == 9 && Level == 10 ) {
      dblPrice = 450.0;
    }
  }
  
  /**
  * Getter method for dblPrice
  * @return price 
  */
  public static double getPrice() {
    return dblPrice;
  }

  /**
  * Turning information to parent to String
  * @return all information in parent class
  */
  public String toString() {
    System.out.println("Your child's name is: " + this.getFirstName() + " " + this.getLastName());
    System.out.println("Your child's level is: " + this.getLevel());
    System.out.println("Your child is in lane: " + this.getLane());
    return "The price of this course is: $" + dblPrice;
  }
}