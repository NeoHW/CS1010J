/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #22: PS2_Ex22_Goldbach.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Goldbach {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    String output = (testConjecture(n) ? "true" : "false");
    System.out.println(output);
  }
  
  // Verify that every even number in range [4, n]
  // an be expressed as the sum of two primes.
  public static boolean testConjecture(int n) {
    
    for (int i = 4; i < n; i += 2) {
      if (!equalsSumOfTwoPrimes(i)) {
        return false;
      }
    }
    return true;
  }
  
  // Check whether num can be written as the sum of two primes.
  // Return true if so, false otherwise.
  public static boolean equalsSumOfTwoPrimes(int num) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 1; i <= num; i++) {
      if (isPrime(i)) {
        list.add(i);
      }
    }
    for(int i = 0; i < list.size(); i++) {
      for(int n = 1; n < list.size(); n++) {
        if(list.get(i) + list.get(n) == num) {
          return true;
        }
      }
    }
    return false;
  }
  
  // Check if num is prime or not, return true if so, false otherwise.
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