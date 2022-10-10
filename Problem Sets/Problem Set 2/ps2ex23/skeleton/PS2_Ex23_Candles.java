/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #23: PS2_Ex23_Candles.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Candles {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n, number of candles: ");
    int n = sc.nextInt();
    
    System.out.print("Enter k, number of residuals to make a new candle: ");
    int k = sc.nextInt();
    
    int count = 0;
    
    System.out.println("Peter will burn this number of candles: " + burnCandles(n,k,count));
  }

  public static int burnCandles(int n, int k, int count) {
    // base case
    if(n < k) {
      count += n;
      return count;
    }
    
    int setsOfn = n/k; // is also equal to number of candles produced by unburnt residual wax
    int remainder = n%k; // candles not used in the sets of n

    count += setsOfn * k;
    int remainingCandles = setsOfn + remainder;
    return burnCandles(remainingCandles, k, count);
  }
}