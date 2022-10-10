/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #07: PS2_Ex07_CountDigits.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class CountDigits {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    int num = sc.nextInt();
    
    int count = 0;
    while(num != 0) {
      num /= 10;
      count++;
    }
    System.out.println("Number of digits = " + count);
  }
}