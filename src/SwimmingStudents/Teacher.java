package SwimmingStudents;

import SwimmingStudents.*;

public class Teacher{
  
  private String strFirstName;
  private String strLastName;

  public Teacher(String firstName, String lastName){
    this.strFirstName = firstName;
    this.strLastName = lastName;
  }

  public String getFirstName(){
    return strFirstName;
  }

  public String getLastName(){
    return strLastName;
  }
}