/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #13: PS1_Ex13_Travel.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class Travel {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter X Y coordinates for Home: ");
    double xOne = sc.nextDouble();
    double yOne = sc.nextDouble();
    
    System.out.print("Enter X Y coordinates for Office: ");
    double xTwo = sc.nextDouble();
    double yTwo = sc.nextDouble();
    
    System.out.print("Enter X Y coordinates for NTUC: ");
    double xThree = sc.nextDouble();
    double yThree = sc.nextDouble();
    
    double totalDistance = distance(xOne,yOne,xTwo,yTwo) + distance(xThree,yThree,xTwo,yTwo) + distance(xOne,yOne,xThree,yThree);
    
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Distance of travel is " + df.format(totalDistance));
  }
  
  // <Write a short description of the method here>
  public static double distance(double x1, double y1, double x2, double y2) {
    
    return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
  }
}