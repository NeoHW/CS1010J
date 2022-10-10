/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #16: PS1_Ex16_TriangleIncenter.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class TriangleIncenter {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Coordinates of 1st vertex: ");
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    
    System.out.print("Coordinates of 2nd vertex: ");
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();
    
    System.out.print("Coordinates of 3rd vertex: ");
    double x3 = sc.nextDouble();
    double y3 = sc.nextDouble();
    
    double a = computeLength(x2, y2, x3, y3);
    double b = computeLength(x1, y1, x3, y3);
    double c = computeLength(x1, y1, x2, y2);

    double p = a + b + c;
    
    double xIncenter = (a*x1 + b*x2 + c*x3)/p;
    double yIncenter = (a*y1 + b*y2 + c*y3)/p;
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    System.out.println("Coordinates of incenter = (" + df.format(xIncenter) + ", " + df.format(yIncenter) + ")");
  }
  
  // <Write a short description of the method here>
  public static double computeLength(double x1, double y1, double x2, double y2) {
    
    return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
  }
}