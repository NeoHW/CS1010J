/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #12: PS1_Ex12_MagicDigit.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class MagicDigit {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
    int first = sc.nextInt();
    System.out.println("Magic digit = " + getMagic(first));
    
    System.out.print("Enter 2nd number: ");
    int second = sc.nextInt();
    System.out.println("Magic digit = " + getMagic(second));
  }
  
  // Take a number and return the magic digit
  public static int getMagic(int num) {
    int pFive = num % 10;
    int pThree = num % 1000 / 100 ;
    int pOne = num / 10000;

    int result = pFive + pThree +pOne;

    return (result <= 9) ? result : result % 10 ;
  }
}