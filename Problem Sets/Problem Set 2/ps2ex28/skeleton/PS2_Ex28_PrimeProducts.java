/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #28: PS2_Ex28_PrimeProducts.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class PrimeProducts {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter integer: ");
    
    int number = sc.nextInt();

    // Get first number 1 or -1
    int plusMinus = returnCoefficient(number);

    System.out.print(number + " = " + plusMinus);

    int i = 2;

    while(number / i != 0) {
      if (number % i == 0) {
        System.out.print(" * " + i);
        number /= i;
      } else {
        i++;
        continue;
      }
      i = 2;
    }

    System.out.println();
  }

  public static int returnCoefficient(int num) {
    return num >= 0 ? 1 : -1;
  }
}