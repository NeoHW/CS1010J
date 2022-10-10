/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #12: PS2_Ex12_Fibonacci.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Fibonacci {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    int number = sc.nextInt();

    System.out.println(fib(number));
    
  }
  
  // Recursive Solution, taking in an int and returning an int

  public static int fib(int n) {
    
    if (n <= 2) {
      return 1;
    } else {
      return fib(n-1) + fib(n-2);
    }
  }

  // Iterative Solution
  /* 
  public static int fib(int n) {
    
    int one = 1, two = 1;
    for (int i = 2; i < n; i++) {
      int three = one + two;
      one = two;
      two = three;
    }
    return two;
  }
  */
}

