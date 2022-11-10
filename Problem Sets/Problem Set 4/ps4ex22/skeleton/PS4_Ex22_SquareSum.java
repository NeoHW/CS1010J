/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #22: PS4_Ex22_SquareSum.java
 * 
 * This program reads a positive integer,
 * and returns the sum of all its digits in square.
 * 
 * Haowei
 */

import java.util.*;

class SquareSum {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    
    System.out.println("Square sum of all digits is " + squareSum(num));
  }
  
  // Calculate the square sum of all digits in a given number
  // Pre-cond: number > 0
  public static int squareSum(int num) {
    
    if(num/10 == 0) {
      return num*num;
    } else {
      return (squareSum(num/10) + (num%10)*(num%10));
    }
    
  }
}