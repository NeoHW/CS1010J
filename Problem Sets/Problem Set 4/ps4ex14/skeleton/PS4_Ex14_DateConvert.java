/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #14: PS4_Ex14_DateConvert.java
 * 
 * This program reads a string in the UK date format
 * and outputs the equivalent American format.
 * 
 * Haowei
 */

import java.util.*;

class DateConvert {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter date in UK format: ");
    String month = sc.next();
    String dateWithComma = sc.next();
    String date = dateWithComma.substring(0, dateWithComma.length()-1);
    String year = sc.next();

    String USdate = date + " " + month + " " + year;
    System.out.println("Date in American format: " + USdate);
  }
}