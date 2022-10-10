/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #06: PS2_Ex06_FirstDigit.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class FirstDigit {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int num = sc.nextInt();
    
    while(num >= 10) {
      num /= 10;
    }

    System.out.println("Leftmost digit is " + num);
  }
}