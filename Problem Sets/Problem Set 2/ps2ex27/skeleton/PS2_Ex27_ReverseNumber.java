/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #27: PS2_Ex27_ReverseNumber.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class ReverseNumber {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the range: ");
    
   int lowerLimit = sc.nextInt(); 
   int upperLimit = sc.nextInt(); 
    
    
    System.out.println("There are " + countReverse(lowerLimit, upperLimit) + " reverse numbers.");
  }
  
  // Count the number of reverse integers in the range [low, high]
  public static int countReverse(int low, int high) {
    
    int count = 0;
    for (int i = low; i <= high; i++) {
      if(isReverse(i)){
        count++;
      }
    }
    return count;
  }
  
  // Check whether a number equals to its reverse
  public static boolean isReverse(int num) {
    
    if (num == reverse(num)){
      return true;
    }
    return false;
  }

  public static int reverse(int num) {
    double sum = 0;
    int count = 1;
    int numberOfDigits = numdig(num);

    while (num / 10 != 0) {
      sum += (num%10) * (Math.pow(10,numberOfDigits - count));
      count++;
      num /= 10;
    }

    sum += (num%10) * (Math.pow(10,numberOfDigits - count));
    return (int)sum;
  }

  public static int numdig(int num) {
    int count = 0;
    while(num / 10 != 0) {
      count++;
      num /= 10;
    }
    return ++count;
  }
}