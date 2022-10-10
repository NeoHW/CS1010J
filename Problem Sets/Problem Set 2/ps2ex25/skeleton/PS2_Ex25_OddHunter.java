/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #25: PS2_Ex25_OddHunter.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class OddHunter {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int number = sc.nextInt();
    
    int sum = 0;

    System.out.println("Answer = "  + addOdd(number, sum));
  }

  public static int addOdd(int number, int sum) {
    
    // base case
    if(!hasOdd(number)) {
      return sum;
    }

    // add odd numbers to sum
    while(number/10 >= 1) {
      if(isEven(number)) {
        number /= 10;
        continue;
      }
      sum += number % 10;
      number /= 10;
      }
    if(!(isEven(number))) {
      sum += number;
    }

    // Recursive call
    return (addOdd(sum, sum));
  }

  public static boolean hasOdd(int number) {
    while(number/10 >= 1) {
      if(number % 2 != 0) {
        return true;
      }
      number /= 10;
    }
    if (number % 2 != 0) {
      return true;
    }
    return false;
  }

  public static boolean isEven(int number){
    return number % 2 == 0;
  }
}