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
    int intWorker;
    String strFirstName;
    String strLastName;
    String strFirstName1;
    String strLastName1;
    int intAge;

    while(blnOption == true) {
      System.out.println("Hi, welcome to swimming pool online orginizer");
      System.out.println("Are you a student, worker or parent?");
      System.out.println("Type done if you are finished");
      strOption = keyboard.readLine();
      if(strOption.equalsIgnoreCase("student") || strOption.equalsIgnoreCase("parent")) {
        System.out.println("Have you registered at our community center before?");
        strRegister = keyboard.readLine();
        if(strRegister.equalsIgnoreCase("yes")) {
          System.out.println("There are currentely " + intRegistered + " people registered within our swimming pool");
          System.out.println("Type a number between 1-10 to find out information about a member");
          intMember = Integer.parseInt(keyboard.readLine());
          if(intMember == 1) {
            Student one = new Student("John", "Lau", 5, 2, 10);
            Parents 
            System.out.println(one);
          }else if(intMember == 2) {
            Student one = new Student("Tom", "Cruise", 5, 2, 13); 
            System.out.println(one);
          }else if(intMember == 3) {
            Student one = new Student("Hayden", "Chung", 10, 1, 17); 
            System.out.println(one);
          }else if(intMember == 4) {
            Student one = new Student("Timmy", "Smith", 6, 4, 12); 
            System.out.println(one);
          }else if(intMember == 5) {
            Student one = new Student("Dom", "George", 7, 5, 14); 
            System.out.println(one);
          }else if(intMember == 6) {
            Student one = new Student("Myers", "James", 7, 5, 13); 
            System.out.println(one);
          }else if(intMember == 7) {
            Student one = new Student("Lebron", "James", 9, 3, 19); 
            System.out.println(one);
          }else if(intMember == 8) {
            Student one = new Student("Jimmy", "Lau", 6, 4, 13); 
            System.out.println(one);
          }else if(intMember == 9) {
            Student one = new Student("Bronny", "JR", 10, 1, 17); 
            System.out.println(one);
          }else if(intMember == 10) {
            Student one = new Student("Stephen", "Curry", 9, 3, 18); 
            System.out.println(one);
          }
        }else if(strRegister.equalsIgnoreCase("no")) {
          System.out.println("Since you have never registered in our swimming pool, you will start at level 1");
          System.out.println("What is your first name?");
          strFirstName = keyboard.readLine();
          System.out.println("What is your last name?");
          strLastName = keyboard.readLine();
          System.out.println("What is your age?");
          intAge = Integer.parseInt(keyboard.readLine());
          Student one = new Student(strFirstName, strLastName, 1, 6, intAge);
          System.out.println(one);
          System.out.println("You will not be visable on the list until you attend the first lesson");
        }
      }else if(strOption.equalsIgnoreCase("worker")) {
        System.out.println("Type a number between 1-8 to access information in our system");
        intWorker = Integer.parseInt(keyboard.readLine());
        if(intWorker == 1) {
         Worker three = new Worker("Tommy", "Smithy", 5, 7, "lifeguard");
         System.out.println(two);
        }else if(intWorker == 2) {
         Worker three = new Worker("Hayden", "Chung", 5, 7, "instructor and lifeguard");
         System.out.println(two);
        }else if(intWorker == 3) {
         Worker three = new Worker("Tyler", "Polly", 5, 7, "instructor and lifeguard");
         System.out.println(two);
        }else if(intWorker == 4) {
         Worker three = new Worker("Elizabeth", "Scotch", 5, 7, "supervisor");
         System.out.println(two);
        }else if(intWorker == 5) {
         Worker three = new Worker("Billy", "Curry", 5, 7, "instructor");
         System.out.println(two);
        }else if(intWorker == 6) {
         Worker three = new Worker("Jack", "Smith", 5, 7, "lifeguard");
         System.out.println(two);
        }else if(intWorker == 7) {
         Worker three = new Worker("Dominic", "SR", 5, 7, "instructor");
         System.out.println(two);
        }else if(intWorker == 8) {
         Worker three = new Worker("Peke", "Chin", 5, 7, "supervisor");
         System.out.println(two);
        }
      }else if(strOption.equalsIgnoreCase("Done")) {
        System.out.println("Goodbye!");
        blnOption = false;
      }
    }
  }
}