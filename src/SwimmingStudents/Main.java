package SwimmingStudents;

import SwimmingStudents.*;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String strOption;
    boolean blnOption = true;
    String strFirstName;
    String strLastName;
    int intPassword;

    System.out.println("Hi, welcome to swimming pool online orginizer");
    System.out.println("Are you a: student, teacher, or supervisor");
    strOption = keyboard.readLine();
    while(blnOption == true) {
      if(strOption.equalsIgnoreCase("student")) {
        System.out.println("What is your first name");
        strFirstName = 
        System.out.println("What is your last name");
        System.out.println("What is your password");
      }else if(strOption.equalsIgnoreCase("teacher")) {
        System.out.println("What is your fire name");
        System.out.println("What is your last name");
        System.out.println("What is your ID?");
      }else if(strOption.equalsIgnoreCase("supervisor")) {
        System.out.println("What is your name");
        System.out.println("What is your last name");
        System.out.println("What is your ID?");
      }else if(strOtpion.equals("Done")) {
        System.out.println("Goodbye!");
        blnOption = false;
      }
    }

    
  }
 

}