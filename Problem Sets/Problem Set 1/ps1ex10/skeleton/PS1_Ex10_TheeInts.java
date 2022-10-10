/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #10: PS1_Ex10_TheeInts.java
 * 
 * This program reads three positive integers,
 * prints out their digits in hundredth position.
 * 
 * Haowei
 */

import java.util.Scanner;

class TheeInts {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter 3 positive integers: ");
    int first = sc.nextInt();
    int second = sc.nextInt();
    int third = sc.nextInt();

    int one = getHundredth(first);
    int two = getHundredth(second);
    int three = getHundredth(third);

    System.out.println(one + " " + two + " " + three);
  }
  
  // Take a number and return the digit in hundredth position
  public static int getHundredth(int num) {
    
    if(num < 100) {
      return 0;
    }
    
    // after %1000, will always left with 3 digit number
    int threeDigit = num % 1000;

    return threeDigit/100;
  }
}