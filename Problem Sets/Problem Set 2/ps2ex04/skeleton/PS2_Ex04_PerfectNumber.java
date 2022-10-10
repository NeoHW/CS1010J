/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #04: PS2_Ex04_PerfectNumber.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class PerfectNumber {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    
    int num = sc.nextInt();
    
    int sum = 0;
    for(int i = 1; i < num; i++){
      if (num % i == 0) {
        sum += i;
      }
    }
    
    if(sum == num){
      System.out.println(num + " is a perfect number");
    } else{
      System.out.println(num + " is not a perfect number, its sum of proper divisors is " + sum);
    }
  }
}