/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #28: PS4_Ex28_Addition.java
 * 
 * This program computes the sum of two integers in a recursive way.
 * 
 * Haowei
 */

import java.util.*;

class Addition {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter two positive integers: ");

    int first = sc.nextInt();
    int second = sc.nextInt();
    
    System.out.println("Sum = " + add(first, second, 0));
  }
  
  // Add two integers recursively by adding digits in corresponding
  // columns together with carry.
  public static int add(int num1, int num2, int carry) {
    
    if(num1 < 10 && num2 < 10) {
      return num1+num2+carry;
    }
    
    int sum = num1%10 + num2%10 + carry;

    int over = (sum >= 10)? 1 : 0;

    return ((sum)%10 + add(num1/10,num2/10,over)*10);
  }
}