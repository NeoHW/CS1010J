/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #03: PS3_Ex03_MaxDifference.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class MaxDifference {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");

    int size = sc.nextInt();
    int[] array = new int[size];

    System.out.print("Enter " + size +  " elements: ");
    for(int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    
    System.out.println("Max difference = " +maxDifference(array) );
  }
  
  // <Write a short description of the method here>
  public static int maxDifference(int[] arr) {
    
    int maxDiff = 0;
    for (int i = 0; i < arr.length -1; i++) {
      int diff = Math.abs(arr[i] - arr[i+1]);
      if (diff > maxDiff) {
        maxDiff = diff;
      }
    }
    return maxDiff;
  }
}