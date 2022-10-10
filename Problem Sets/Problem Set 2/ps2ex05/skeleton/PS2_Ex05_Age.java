/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #05: PS2_Ex05_Age.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Age {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int count = 0;
    int age;

    do{
      System.out.print("Enter age: ");
      age = sc.nextInt();
      count++;
    } while(age <= 0 || age >= 100);
    
    System.out.println("Your age is " + age);
    System.out.println("Number of attempts = " + count);
  }
}