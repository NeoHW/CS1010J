/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #15: PS1_Ex15_Cuboid.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class Cuboid {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter length: ");
    int length = sc.nextInt();
    System.out.print("Enter width : ");
    int width = sc.nextInt();
    System.out.print("Enter height: ");
    int height = sc.nextInt();
    
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Surface area = " + computeSurfaceArea(length, width, height));
    
    System.out.println("Diagonal = " + df.format(computeDiagonal(length, width, height)));
  }
  
  // <Write a short description of the method here>
  public static int computeSurfaceArea(int length, int width, int height) {
    
    return 2*(length*width) + 2*(width*height) + 2*(length*height);
  }
  
  // <Write a short description of the method here>
  public static double computeDiagonal(int length, int width, int height) {
    
    return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) + Math.pow(height, 2));
  }
}