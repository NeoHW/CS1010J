/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #06: PS3_Ex06_PositiveFirst.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class PositiveFirst {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    if(isPositiveFirst(arr)){
      System.out.println("Positive numbers appear before non-positive numbers");
    } else {
      System.out.println("Some positive numbers appear after non-positive numbers");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean isPositiveFirst(int[] numbers) {
    boolean flag = true;
    int count = 0;

    for (int i = 0; i < numbers.length; i++) {
      // count becomes 1 once it encounters a non-positive number
      if(numbers[i] <= 0) {
        count = 1;
      }
      // switch flag to false if it encounters a positive number after flag == true and count == 1;
      if(numbers[i] > 0) {
        if(flag && count == 1) {
          flag = false;
        }
      }
    }
    return flag;
  }

  // Easier method:
  /* 
  public static boolean isPositiveFirst(int[] numbers) {
    for(int i =0; i < numbers.length; i++) {
      if(numbers[i] <= 0 && numbers[i+1] > 0) {
        return false;
      }
    }
    return true;
  }
  */
}