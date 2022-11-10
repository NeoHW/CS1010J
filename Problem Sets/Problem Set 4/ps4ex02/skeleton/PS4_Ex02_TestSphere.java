/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #02: PS4_Ex02_TestSphere.java
 * 
 * This program creates a Sphere object and displays its information.
 * 
 * THIS FILE IS COMPLETE; NOT TO BE CHANGED
 */

import java.util.*;
import java.text.*;

class TestSphere {
  
  public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    // Get radius from user
    System.out.print("Enter radius: ");
    double radius = scanner.nextDouble();
    
    // Create a Sphere object of given radius 
    Sphere sphere = new Sphere(radius);
    
    // Display the information about this sphere
    DecimalFormat df = new DecimalFormat("0.0000");
    System.out.println("Radius = " + df.format(sphere.getRadius()));
    System.out.println("Diameter = " + df.format(sphere.computeDiameter()));
    System.out.println("Circumference = " + df.format(sphere.computeCircumference()));
    System.out.println("Surface area = " + df.format(sphere.computeSurfaceArea()));
    System.out.println("Volume = " + df.format(sphere.computeVolume()));
  }   
}