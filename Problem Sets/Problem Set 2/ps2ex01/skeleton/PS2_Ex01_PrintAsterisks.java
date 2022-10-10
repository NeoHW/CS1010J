/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #01: PS2_Ex01_PrintAsterisks.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class PrintAsterisks {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    int number = sc.nextInt();

    for(int i = 0; i < number; i++){
      System.out.print('*');
    }
    
    System.out.println();  // just to change line
  }
}