/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #21: PS2_Ex21_Legendre.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Legendre {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    String output = (testConjecture(n) ? "true" : "false");
    System.out.println(output);
  }
  
  // Verify if there is at least one prime number in
  // each range (1^2 to 2^2), (2^2 to 3^2), (n^2 to (n+1)^2)
  public static boolean testConjecture(int n) {
    int lowerLimit = (int)Math.pow(n,2);
    int upperLimit = (int)Math.pow(n+1,2);
    return hasPrime(lowerLimit, upperLimit) ? true : false;
  }
  
  // Check whether there is any prime in range [low, high],
  // return true if so, or false otherwise
  public static boolean hasPrime(int low, int high) {
    
    for (int i = low; i < high; i++) {
      if(isPrime(i)) {
        return true;
      }
    }
    return false;
  }
  
  
  // <Write a short description of the method here>
  public static boolean isPrime(int num) {
    
    if (num == 1) {
      return true;
    }
    if (num != 2 && num %2 == 0) {
      return false;
    }
    for (int i = 3; i*i < num; i +=2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}