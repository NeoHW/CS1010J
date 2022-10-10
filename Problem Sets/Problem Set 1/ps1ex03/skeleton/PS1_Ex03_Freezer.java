/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #03: PS1_Ex03_Freezer.java
 * 
 * This program estimates the temperature in a freezer 
 * given the elapsed time (hours) since a power failure.
 * 
 * Haowei
 */

import java.util.Scanner;

class Freezer {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter hours and minutes since power failure: ");
    
    // read hours and minutes one by one
    int hours = sc.nextInt();
    int minutes = sc.nextInt();
    double time = hours + (minutes/60.0);
    double temperature = (4 * time * time)/(time + 2) - 20;
    
    System.out.println("Temperature in freezer = " + temperature);
  }
}