/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #09: PS2_Ex09_CountNumbers.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class CountNumbers {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter two divisors: ");
    int divOne = sc.nextInt();
    int divTwo = sc.nextInt();
    
    System.out.print("Enter lower and upper limits: ");
    int limOne = sc.nextInt();
    int limTwo = sc.nextInt();
    
    int count = countNumbers(divOne, divTwo, limOne, limTwo);
    
    System.out.println("Answer = " + count);
  }
  
  // <Write a short description of the method here>
  public static int countNumbers(int div1, int div2, int lim1, int lim2) {
    
    int count = 0;
    for(int i = lim1; i <= lim2 ; i++){
      if(i % div1 != 0 && i % div2 != 0 ){
        count++;
      }
    }
    return count;
  }
}