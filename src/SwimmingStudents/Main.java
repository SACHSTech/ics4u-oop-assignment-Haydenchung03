package SwimmingStudents;

import SwimmingStudents.*;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    Student Student1;
    Parent two;
    Worker three;

    String strOption;
    boolean blnOption = true;
    String strRegister;
    int intRegistered = 10;
    int intMember;
    int intWorker;
    String strFirstName;
    String strLastName;
    int intAge;

    while(blnOption == true) {
      System.out.println("Hi, welcome to swimming pool online orginizer");
      System.out.println("Are you a student, worker or parent?");
      System.out.println("Type done if you are finished");
      strOption = keyboard.readLine();
      if(strOption.equalsIgnoreCase("student") || strOption.equalsIgnoreCase("parent")) {
        System.out.println("Have you registered at our community center before? Type yes or no");
        strRegister = keyboard.readLine();
        if(strRegister.equalsIgnoreCase("yes")) {
          System.out.println("There are currentely " + intRegistered + " people registered within our swimming pool");
          System.out.println("Type a number between 1-10 to find out information about a member");
          intMember = Integer.parseInt(keyboard.readLine());
          if(intMember == 1) {
            Student1 = new Student("John", "Lau", 5, 2, 10);
            two = new Parent("John", "Lau", 5, 2);
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 2) {
            Student1 = new Student("Tom", "Cruise", 5, 2, 13); 
            Parent two = new Parent("Tom", "Cruise", 5, 2);
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 3) {
            Student1 = new Student("Hayden", "Chung", 10, 1, 17); 
            Parent two = new Parent("Hayden", "Chung", 10, 1);
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 4) {
            Student1 = new Student("Timmy", "Smith", 6, 4, 12); 
            Parent two = new Parent("Timmy", "Smith", 6, 4); 
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 5) {
            Student one = new Student("Dom", "George", 7, 5, 14); 
            Parent two = new Parent("Dom", "George", 7, 5);
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 6) {
            Student1 = new Student("Myers", "James", 7, 5, 13); 
            Parent two = new Parent("Myers", "James", 7, 5);
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 7) {
            Student1 = new Student("Lebron", "James", 9, 3, 19); 
            Parent two = new Parent("Lebron", "James", 9, 3); 
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 8) {
            Student1 = new Student("Jimmy", "Lau", 6, 4, 13); 
            Parent two = new Parent("Jimmy", "Lau", 6, 4); 
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 9) {
            Student1 = new Student("Bronny", "JR", 10, 1, 17); 
            Parent two = new Parent("Bronny", "JR", 10, 1); 
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
          }else if(intMember == 10) {
            Student1 = new Student("Stephen", "Curry", 9, 3, 18); 
            Parent two = new Parent("Stephen", "Curry", 9, 3); 
            if(strOption.equalsIgnoreCase("student")){
              System.out.println(one);
            }else if(strOption.equalsIgnoreCase("parent")){
              System.out.println(two);
            }
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
         Worker three = new Worker("Tommy", "Smithy", 0, 0, "lifeguard");
         System.out.println(three);
        }else if(intWorker == 2) {
         Worker three = new Worker("Hayden", "Chung", 5, 2, "instructor and lifeguard");
         System.out.println(three);
        }else if(intWorker == 3) {
         Worker three = new Worker("Tyler", "Polly", 6, 4, "instructor and lifeguard");
         System.out.println(three);
        }else if(intWorker == 4) {
         Worker three = new Worker("Elizabeth", "Scotch", 0, 0, "supervisor");
         System.out.println(three);
        }else if(intWorker == 5) {
         Worker three = new Worker("Billy", "Curry", 9, 3, "instructor");
         System.out.println(three);
        }else if(intWorker == 6) {
         Worker three = new Worker("Jack", "Smith", 10, 1, "instructor and lifeguard");
         System.out.println(three);
        }else if(intWorker == 7) {
         Worker three = new Worker("Dominic", "SR", 7, 5, "instructor");
         System.out.println(three);
        }else if(intWorker == 8) {
         Worker three = new Worker("Peke", "Chin", 5, 7, "supervisor");
         System.out.println(three);
        }
      }else if(strOption.equalsIgnoreCase("Done")) {
        System.out.println("Thank you!");
        blnOption = false;
      }
    }
  }
}