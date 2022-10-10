/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #11: PS2_Ex11_CycleLength.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class CycleLength {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter range: ");
    int low = sc.nextInt();
    int high = sc.nextInt();
    
    System.out.println("Maximum cycle length = " + maxCycleLength(low, high));
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
  
  // Calculate the cycle length of all the numbers
  // in range [low, high]; return maximum cycle length
  public static int maxCycleLength(int low, int high) {
    
    int max = countIterations(low);
    for(int i = low+1; i <= high; i++) {
      int iterations = countIterations(i);
      if (iterations > max) {
        max = iterations;
      }
    }
    return max;
  }
}