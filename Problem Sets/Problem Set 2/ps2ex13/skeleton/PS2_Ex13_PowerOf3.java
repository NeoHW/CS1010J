/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #13: PS2_Ex13_PowerOf3.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class PowerOf3 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter start and end: ");
    
    int start = sc.nextInt();
    int end = sc.nextInt();
    
    System.out.println("Answer = " + countNumbers(start,end));
  }
  
  // Count the number of integers from start to
  // end (both inclusive) that are power of 3
  public static int countNumbers(int start, int end) {
    
    int count = 0;
    double power = 1;
    while(true) {
      double x = Math.pow(3, power);
      if(x >= start && x <= end) {
        count++;
      }
      if (x > end) {
        break;
      }
      power++;
    }
    return count;
    }
  }