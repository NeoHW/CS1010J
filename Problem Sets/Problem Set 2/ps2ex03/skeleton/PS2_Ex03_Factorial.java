/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #03: PS2_Ex03_Factorial.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Factorial {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    
    int num = sc.nextInt();

    System.out.println(fac(num));
    
  }

  public static int fac(int num) {
    if (num == 1) {
      return 1;
    } else {
      return num * fac(num -1);
    }
  }

}