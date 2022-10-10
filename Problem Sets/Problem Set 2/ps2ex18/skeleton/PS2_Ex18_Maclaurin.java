/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #18: PS2_Ex18_Maclaurin.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class Maclaurin {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter x and n: ");
    int x = sc.nextInt();
    int n = sc.nextInt();
    
    DecimalFormat df = new DecimalFormat("0.000");
    System.out.println(df.format(computeMaclaurin(x, n)));
  }
  
  // <Write a short description of the method here>
  public static double computeMaclaurin(int x, int n) {
    
    double sum = 1;
    int fac = 1;
    for (int i = 1; i < n ; i++) {
      fac *= i;
      sum += Math.pow(x, i)/fac;
    }
    return sum;
  }
}