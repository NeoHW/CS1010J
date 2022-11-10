/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #10: PS4_Ex10_Calculator.java
 * 
 * This program implements a simple calculator that can perform
 * addition, subtraction, multiplication and division on integers.
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class Calculator {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Enter the number of operations: ");
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      int first = Integer.valueOf(sc.next());
      String operator = sc.next();
      int second = Integer.valueOf(sc.next());

      switch(operator) {
        case "+":
          System.out.println(first + " + " + second + " = " + (first+second));
          break;
        case "-":
          System.out.println(first + " - " + second + " = " + (first-second));
          break;
        case "*":
          System.out.println(first + " * " + second + " = " + (first*second));
          break;
        case "/":
          System.out.println(first + " / " + second + " = " + df.format(((double)first/second)));
          break;
      }
    }
  }
}