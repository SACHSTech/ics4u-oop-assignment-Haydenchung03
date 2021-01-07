package SwimmingStudents;

import SwimmingStudents.*;
/**
* super class
*/
public class People {

  // Instance Variables
  private String strFirstName;
  private String strLastName;
  private int intLevel;
  private int intLaneNumber;
  
  /**
  * Constructor: Creates a new person Instance
  * @param firstName - person's first name
  * @param lastName - person's last Name
  * @param Level - person's level in Swimming 
  * @param intLane - person's lane number
  */
  public People(String firstName, String lastName, int Level, int intLane) {
    this.strFirstName = firstName;
    this.strLastName = lastName;
    this.intLevel = Level;
    this.intLaneNumber = intLane;
  }

  /**
  * Getter method for firstName
  * @return first name
  */
  public String getFirstName() {
    return strFirstName;
  }

  /**
  * Getter method for lastName
  * @return last name
  */
  public String getLastName() {
    return strLastName;
  }
  
  /**
  * Getter method for Level
  * @return level number
  */
   public int getLevel() {
    return intLevel;
  }

  /**
  * Getter method for intLane
  * @return lane number
  */
  public int getLane() {
    return intLaneNumber;
  }
}