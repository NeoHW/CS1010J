/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #14: PS1_Ex14_AM_GM.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class Means {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 3 positive integers: ");
    
    int first = sc.nextInt();
    int second = sc.nextInt();
    int third = sc.nextInt();
    
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Arithmetic mean = " + df.format(computeAM(first, second, third)));
    System.out.println("Geometric mean = " + df.format(computeGM(first, second, third)));
  }
  
  // <Write a short description of the method here>
  public static double computeAM(int a, int b, int c) {
    
    return (a+b+c)/3.00;
  }
  
  // <Write a short description of the method here>
  public static double computeGM(int a, int b, int c) {
    
    return Math.cbrt(a * b * c);
  }
}