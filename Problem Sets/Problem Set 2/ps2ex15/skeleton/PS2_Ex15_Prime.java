/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #15: PS2_Ex15_Prime.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Prime {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    
    int num = sc.nextInt();
    
    if(isPrime(num)) {
      System.out.println(num + " is a prime");
    } else {
      System.out.println(num + " is not a prime");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }
    if (num != 2 && num % 2 == 0) {
      return false;
    }
    for (int i = 3; i*i <= num; i += 2 ) {
      if (num % i == 0){
        return false;
      }
    }
    return true;
  }
}