/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #17: PS1_Ex17_MaxInt.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class MaxInteger {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter three integers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    
    System.out.println("Maximum input integer is " + getMax(num1, num2, num3));
  }
  
  // <Write a short description of the method here>
  public static int getMax(int num1, int num2, int num3) {
    
    int[] numbers = {num1 , num2, num3};
    int max = num1;
    for (int i : numbers) {
      if(i > max) {
        max = i;
      }
    }
    return max;
  }
}