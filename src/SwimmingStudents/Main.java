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

    System.out.println("Hi, welcome to swimming pool online orginizer");
    System.out.println("Are you a: student, teacher, supervisor or parent");
    strOption = keyboard.readLine();
    if(strOption.equalsIgnoreCase("student")) {

    }else if(strOption.equalsIgnoreCase("teacher")) {

    }else if(strOption.equalsIgnoreCase("supervisor")) {

    }else if(strOption.equalsIgnoreCase("parent")) {
      
    }

    
  }
 

}