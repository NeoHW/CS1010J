/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #01: PS4_Ex01_TestMyCircle.java
 * 
 * This program uses the MyCircle class to create a
 * Mycircle object and computes its area.
 * 
 * THIS FILE IS COMPLETE; NOT TO BE CHANGED
 */

import java.util.*;
import java.text.*;

class TestMyCircle {
  
  public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    // Get radius from user
    System.out.print("Enter radius: ");
    double radius = scanner.nextDouble();
    
    // Create a Mycircle object and sets its radius 
    MyCircle circle = new MyCircle();
    circle.setRadius(radius);
    
    // Compute area of the Mycircle object
    double area = circle.computeArea();
    
    // Display the result
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Area = " + df.format(area));
  }   
}