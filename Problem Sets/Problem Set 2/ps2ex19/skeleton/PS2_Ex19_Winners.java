/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #19: PS2_Ex19_Winners.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Winners {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter factor-digit: ");
    int factor = sc.nextInt();
    
    System.out.print("Enter must-have-digit: ");
    int mustHaveDigit = sc.nextInt();
    
    System.out.print("Enter the number of participants: ");
    int participants = sc.nextInt();
    
    int count = 0;
    for(int i = 0; i <= participants; i++) {
      if(contains(i, mustHaveDigit) && i % factor == 0) {
        count++;
      }
    }

    System.out.println("Number of winners: " + count);
  }
  
  // Return true if number contains the mustHaveDigit, or false otherwise
  public static boolean contains(int number, int mustHaveDigit) {
    while(number != 0){
      if(number % 10 == mustHaveDigit) {
        return true;
      } else {
        number /= 10;
      }
    }
    return false;
  }
}