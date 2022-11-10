/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #27: PS4_Ex27_OddDigitSum.java
 * 
 * This program checks if the sum of all digits of
 * a given number is odd.
 * 
 * Haowei
 */

import java.util.*;

class OddDigitSum {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();

    if(isDigitSumOdd(num)){
      System.out.println("Sum of digits for " + num + " is odd");
    } else {
      System.out.println("Sum of digits for " + num + " is even");
    }
  }
  
  // Return ture if the sum of all digits is odd, or false otherwise.
  // Pre-cond: num > 0
  public static boolean isDigitSumOdd(int num) {
    
    // logic: 
    // even + even = even (False && False == False)
    // odd + odd = even (True && True == False)
    // even + odd = odd (else True)


    // num%2 checks last digit
    if(num < 10) {
      return num %2 == 1;
    } else {
      return ((num%2 == 0 && isDigitSumOdd(num/10)) || (num%2 != 0 && !isDigitSumOdd(num/10)));
    }
    
    /** Prof Ans
    if (num < 10) {  // single digit
      return num%2 == 1;
    }
    
    int digit = num % 10;
    
    if (digit%2 == 0) {  // this digit is even
      // even + odd = odd; even + even = even -> 'even' digit won't affect result
      return isDigitSumOdd(num/10);
    } else {  // this digit is odd
      // odd + odd = even; odd + even = odd -> 'odd' digit turns over result
      return !isDigitSumOdd(num/10);
    } 
     */



  }
}