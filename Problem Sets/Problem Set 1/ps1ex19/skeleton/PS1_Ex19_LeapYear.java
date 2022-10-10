/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #19: PS1_Ex19_LeapYear.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class LeapYear {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter year: ");
    int year = sc.nextInt();
    
    if(isLeapYear(year)) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean isLeapYear(int year) {
    
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      return true;
    } 
    return false;
  }
}