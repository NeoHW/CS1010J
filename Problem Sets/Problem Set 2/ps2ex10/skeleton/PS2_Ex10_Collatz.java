/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #10: PS2_Ex10_Collatz.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Collatz {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a natural number: ");
    int number = sc.nextInt();
    
    System.out.println("Number of iterations = " + countIterations(number));
  }
  
  // Calculate how many rounds are needed to process n till 1
  public static int countIterations(int n) {
    
    int counter = 0;
    while (n != 1){
      if (n%2 == 0) {
        n /= 2;
      } else {
        n = n*3 + 1;
      }
      counter++;
    }
    return counter;
  }
}