/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #06: PS1_Ex06_TriangleCentroid.java
 * 
 * This program computes the centroid (G) of a triangle
 * given the coordinates of three vertices.
 * 
 * Haowei
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class TriangleCentroid {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Coordinates of 1st vertex: ");
    double xOne = sc.nextDouble();
    double yOne = sc.nextDouble();
    
    System.out.print("Coordinates of 2nd vertex: ");
    double xTwo = sc.nextDouble();
    double yTwo = sc.nextDouble();
    
    System.out.print("Coordinates of 3rd vertex: ");
    double xThree = sc.nextDouble();
    double yThree = sc.nextDouble();

    double xCentroid = (xOne + xTwo + xThree)/3;
    double yCentroid = (yOne + yTwo + yThree)/3;

    DecimalFormat df = new DecimalFormat("0.00");
    
    System.out.println("Coordinates of centroid = (" + df.format(xCentroid) + ", " + df.format(yCentroid) + ")");
  }
}