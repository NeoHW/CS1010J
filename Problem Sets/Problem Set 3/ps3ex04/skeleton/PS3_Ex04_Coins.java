/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #04: PS3_Ex04_Coins.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Coins {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter amount in dollars: ");
    double amount = sc.nextDouble();

    int[] denoms = {100, 50, 20, 10, 5, 1};
    
    int[] counts = computeCoins(amount, denoms);

    System.out.println("Minimum number of coins needed: " + sum(counts));
    
    for(int i = 0; i < counts.length; i++) {
      System.out.println("Denoms " + denoms[i] + "c: " + counts[i]);
    }
  }
  
  // <Write a short description of the method here>
  public static int[] computeCoins(double amount, int[] denoms) {
    
    // counts[0] will be the number of coins used for $1, etc.
    int[] counts = new int[denoms.length];  // all 0 by default
    amount *= 100;
    for(int i = 0; i < counts.length; i++) {
      while(amount >= denoms[i]) {
        counts[i]++;
        amount -= denoms[i];
      }
    }
    return counts;
  }

  public static int sum(int[] counts) {
    int sum =0;
    for (int i = 0; i < counts.length; i++) {
      sum += counts[i];
    }
    return sum;
  }
}