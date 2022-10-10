/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #17: PS2_Ex17_PrintSquare.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class PrintSquare {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter k: ");
    int num = sc.nextInt();

    printSquare(num);    
  }

  public static void printSquare(int num) {
    
    printFirstLast(num);
    
    printMiddle(num);

    printFirstLast(num);
  }

  public static void printFirstLast(int num) {
    for(int i = 0; i < num; i++){
      System.out.print("*");
    }
    System.out.println();
  }

  public static void printMiddle(int num) {
    num -= 2;
    for(int rows = 0; rows < num; rows++) {
      System.out.print("*");
      for(int space = 0; space < num; space++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
  }
}