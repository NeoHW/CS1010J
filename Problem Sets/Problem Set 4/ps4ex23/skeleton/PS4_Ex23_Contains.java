/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #23: PS4_Ex23_Contains.java
 * 
 * This program checks if digit 'k' appears in 'number'.
 * 
 * Haowei
 */

import java.util.*;

class Contains {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    
    System.out.print("Enter a single digit integer k: ");
    int digit = sc.nextInt();

    if(contains(num, digit)) {
      System.out.println( digit + " appears in " + num);
    } else {
      System.out.println( digit + " doesn't appear in " + num);
    }
    
  }
  
  // Check if k appears in any digit of number
  // Return true if so, or false otherwise
  // Pre-cond: number > 0, k < 10 && k >= 0
  public static boolean contains(int number, int k) {

    if(number == 0) {
      return false;
    }

    if(number%10 == k){
      return true;
    } else {
      return(contains(number/10, k));
    }
  }
}