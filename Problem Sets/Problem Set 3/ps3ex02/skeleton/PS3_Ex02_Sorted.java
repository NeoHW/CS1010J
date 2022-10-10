/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #02: PS3_Ex02_Sorted.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Sorted {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");

    int size = sc.nextInt();
    int[] array = new int[size];

    System.out.print("Enter " + size +  " elements: ");
    for(int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    
    if(isSorted(array)) {
      System.out.println("Given array is sorted.");
    } else {
      System.out.println("Given array is not sorted.");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean isSorted(int[] arr) {
    
    int max = arr[0];
    for(int i = 0; i < arr.length; i++) {
      if (arr[i] < max) {
        return false;
      }
    }
    return true;
  }
}