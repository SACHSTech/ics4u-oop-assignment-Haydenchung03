package SwimmingStudents;

import SwimmingStudents.*;

public class Student extends People {

  // Instance variables
  private int intAge;
  // Class variables
  private static String strInstructor = " ";
  private static int intStudents = 10;
  
  /**
  * Constructor: Creates a new student Instance
  * @param firstName - person's first name
  * @param lastName - person's last Name
  * @param Level - person's level in Swimming 
  * @param intLane - person's lane number
  * @param Age - person's age
  */

  public Student(String firstName, String lastName, int Level, int intLane, int Age) {
    super(firstName, lastName, Level, intLane);
    this.intAge = Age;
    // Conditions to see who the instructor is
    if(Level == 5) {
      strInstructor = "Hayden";
    }else if(Level == 6) {
      strInstructor = "Tyler";
    }else if(Level == 7) {
      strInstructor = "Dominic";
    }else if(Level == 9) {
      strInstructor = "Billy";
    }else if(Level == 10) {
      strInstructor = "Jack";
    }else if(Level == 1) {
      strInstructor = "Kanye";
      intStudents++;
    }
  }

  /**
  * Getter method for strInstructor
  * @return instructor name 
  */
  public static String getInstructor() {
    return strInstructor;
  }

  /**
  * Getter method for intStudents
  * @return instructor name 
  */
  public static int getStudents() {
    return intStudents;
  }


  /**
  * Getter method for intAge
  * @return student's age
  */
  public int getAge() {
    return intAge;
  }

  /**
  * Turning information to student to String
  * @return all information in student class
  */
  public String toString() {
    System.out.println("Your full name is: " + this.getFirstName() + " " + this.getLastName());
    System.out.println("Your Level is: " + this.getLevel());
    System.out.println("The Lane you are swimming is: " + this.getLane());
    System.out.println("Your instructor is: " + strInstructor); 
    System.out.println("There are currentely this number of students: " + intStudents);
    return "Your Age is: " + intAge;
  }
}