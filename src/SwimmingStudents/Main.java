package SwimmingStudents;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOEXception {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    int intStudent;
    int intTeacher;
    int intSupervisor;

    String strName;
    String strProgram;
    int intRoomNumber;
    int intLevel;
    int intLane;
    int intAge;

    String strOption;
    boolean blnOption = true;

    System.out.println("Hi, welcome to swimming pool online orginizer");
    System.out.println("Are you a: student, teacher, supervisor or parent");
    strOption = keyboard.readLine();
    while(blnOption = true) {
      if(strOption.equalsIgnoreCase("student")) {
        System.out.println("What is your name");
      }else if(strOption.equalsIgnoreCase("teacher")) {
        System.out.println("What is your name");
      }else if(strOption.equalsIgnoreCase("supervisor")) {
        System.out.println("What is your name");
      }else if(strOption.equalsIgnoreCase("parent")) {
        System.out.println("What is your name");
      }else if(strOtpion.equals("Done")) {
        System.out.println("Goodbye!");
        blnOption = false;
      }
    }

    
  }
 

}