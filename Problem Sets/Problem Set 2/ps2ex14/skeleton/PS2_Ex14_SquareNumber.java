/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #14: PS2_Ex14_SquareNumber.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class SquareNumber {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    
    int number = sc.nextInt();

    if(isSquare(number)){
      System.out.println(number + " is a square number");
    } else {
      System.out.println(number + " is not a square number");
    }
  }

  public static boolean isSquare(int number) {
    double root = Math.sqrt(number);
    return (root / (int)root == 1);
  }
}