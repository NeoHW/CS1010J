/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #01: PS3_Ex01_NonNegative.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class NonNegative {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");

    int size = sc.nextInt();
    int[] array = new int[size];

    System.out.print("Enter " + size +  " elements: ");
    for(int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }

    if (nonNegative(array)) {
      System.out.println("All array elements are non-negative");
    } else {
      System.out.println("Some array elements are negative");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean nonNegative(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] < 0) {
        return false;
      }
    }
    return true;
  }
}