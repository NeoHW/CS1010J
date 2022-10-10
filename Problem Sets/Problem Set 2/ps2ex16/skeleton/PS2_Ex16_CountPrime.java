/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #16: PS2_Ex16_CountPrime.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class CountPrime {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter limit: ");
    int limit = sc.nextInt();
    
    System.out.println("Number of primes (1-" + limit + "): " + countPrimes(limit));
  }
  
  // <Write a short description of the method here>
  public static boolean isPrime(int num) {
    if (num == 2) {
      return true;
    }
    if (num % 2 == 0) {
      return false;
    }
    for (int i = 3; i*i <= num; i += 2 ) {
      if (num % i == 0){
        return false;
      }
    }
    return true;
  }
  
  // <Write a short description of the method here>
  public static int countPrimes(int limit) {
    int count = 0;
    for(int i = 2; i <= limit; i++) {
      if(isPrime(i)){
        count++;
      }
    }
    return count;
  }
}