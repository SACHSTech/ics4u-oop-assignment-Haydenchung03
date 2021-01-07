package SwimmingStudents;

import SwimmingStudents.*;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String strOption;
    boolean blnOption = true;
    String strRegister;
    int intRegistered = 10;
    int intMember;
    while(blnOption == true) {
      System.out.println("Hi, welcome to swimming pool online orginizer");
      System.out.println("Are you a: student or worker?");
      strOption = keyboard.readLine();
      if(strOption.equalsIgnoreCase("student")) {
        System.out.println("Have you registered at our community center before?");
        strRegister = keyboard.readLine();
        if(strRegister.equalsIgnoreCase("yes")) {
          System.out.println("There are currentely " + intRegistered + " people registered within our swimming pool");
          System.out.println("Type a number between 1-10 to find out information about a member");
          intMember = Integer.parseInt(keyboard.readLine());
          if(intMember == 1) {
            Student one = new Student("John", "Lau", 5, 2, 10); 
            System.out.println(one);
          }
        }
      }else if(strOption.equalsIgnoreCase("teacher")) {
       
      }else if(strOption.equalsIgnoreCase("Done")) {
        System.out.println("Goodbye!");
        blnOption = false;
      }
    }
  }
}