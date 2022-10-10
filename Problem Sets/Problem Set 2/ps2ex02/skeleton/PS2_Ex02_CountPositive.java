/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #02: PS2_Ex02_CountPositive.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class CountPositive {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int count = 0;

    System.out.print("Enter 5 integers: ");
    
    for(int i = 0; i < 5 ; i++) {
      int num = sc.nextInt();
      if (num > 0) {
        count++;
      }
    }
    
    System.out.println("Count = " + count);
  }
}