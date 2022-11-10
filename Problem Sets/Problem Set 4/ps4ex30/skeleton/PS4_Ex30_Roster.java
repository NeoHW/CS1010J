/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #30: PS4_Ex30_Roster.java
 * 
 * This program reads student number and major, and prints
 * out the student roster in ascending order of student matric.
 * 
 * Haowei
 */

import java.util.*;

class Roster {
  
  public static void main(String[] args) {
    
    // read student info
    Student[] roster = readRoster();
    
    // sort roster accoding to ascending order of student number
    sortRoster(roster);
    
    // print roster
    printRoster(roster); 
  }
  
  // Read student number and major of students and return an array of Student objects.
  public static Student[] readRoster() {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of students in class: ");
    int number = sc.nextInt();
    sc.nextLine(); // to consume enter 

    Student[] roster = new Student[number];
    
    System.out.println("Enter student number and major of " + number + " students:");
    for(int i=0; i < roster.length; i++) {
      /** 
      String input = sc.nextLine();
      String[] parts = input.split(" ");

      String studentNumber = parts[0];
      String major = "";
      for(int j = 1; j < parts.length; j++) {
        major = major + " " + parts[j];
      }
      */

      String studentNumber, major;
      studentNumber = sc.next();
      major = sc.nextLine().trim();

      roster[i] = new Student(studentNumber, major);
    }
    return roster;
  }
  
  // Sort roster according to ascending order of matric
  public static void sortRoster(Student[] roster) {
    
    for(int end = roster.length-1; end > 0; end--) {
      for(int i = 0; i < end; i++) {
        if(roster[i].getStuNumber().compareTo(roster[i+1].getStuNumber()) > 0) {
          Student temp = roster[i];
          roster[i] = roster[i+1];
          roster[i+1] = temp;
        }
      }
    }
  }
  
  // Print the roster
  public static void printRoster(Student[] roster) {
    System.out.println("Sorted list:");
    for (int i = 0; i < roster.length; i++) {
      System.out.println(roster[i]);
    }
  }
}