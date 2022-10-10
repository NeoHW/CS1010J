/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #02: PS1_Ex02_TimeConversion.java
 * 
 * This program prints out time in hours and minutes.
 * 
 * Haowei
 */

import java.util.Scanner;   // to use Scanner for data input

class TimeConversion {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter time in minutes: ");
    int input = sc.nextInt();
    int hours = input/60;
    int minutes = input % 60;
    
    System.out.println(hours + " hours and " + minutes + " minutes");
  }
}