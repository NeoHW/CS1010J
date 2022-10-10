/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #20: PS1_Ex20_Triangle.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Triangle {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int length1 = sc.nextInt();
    int length2 = sc.nextInt();
    int length3 = sc.nextInt();
    
    if (length1 >= length2 + length3 || length2 >= length1 + length3 || length3 >= length2 + length1 ) {
      System.out.println("Not a triangle");
    } else if (length1 == length2 && length2 == length3) {
      System.out.println("Equilateral");
    } else if (length1 == length2 || length2 == length3) {
      System.out.println("Isosceles");
    } else {
      System.out.println("Scalene");
    }
  }
}