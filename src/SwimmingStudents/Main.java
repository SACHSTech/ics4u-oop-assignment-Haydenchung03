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
    while(blnOption == true) {
      System.out.println("Hi, welcome to swimming pool online orginizer");
      System.out.println("Are you a: student or worker?");
      strOption = keyboard.readLine();
      if(strOption.equalsIgnoreCase("student")) {
        System.out.println("What is your first name");
        strFirstName = keyboard.readLine();
        System.out.println("What is your last name");
        strLastName = keyboard.readLine();
        Student Hayden = new Student(strFirstName, strLastName, 5, 4, 17);
        System.out.println(Hayden);
      }else if(strOption.equalsIgnoreCase("teacher")) {
        System.out.println("What is your fire name");
        strFirstName = keyboard.readLine();
        System.out.println("What is your last name");
        strLastName = keyboard.readLine();
      }else if(strOption.equalsIgnoreCase("Done")) {
        System.out.println("Goodbye!");
        blnOption = false;
      }
    }
  }
}