/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #14: PS3_Ex14_SetContainment.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class SetContainment {
  
  public static void main(String[] args) {
    
    // Note: CodeCrunch only accepts one Scanner object!
    // So create 'sc' here and pass it to scanArray method twice
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Size of 1st array? ");
    int[] arrA = scanArray(sc);
    
    System.out.print("Size of 2nd array? ");
    int[] arrB = scanArray(sc);
    

    if(isSubset(arrA, arrB)){
      System.out.println("1st array is a subset of 2nd array");
    } else {
      System.out.println("1st array is not a subset of 2nd array");
    }
  }
  
  // Read elements into an array and return it
  public static int[] scanArray(Scanner sc) {
    
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " values: ");
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    return arr;
  }
  
  // <Write a short description of the method here>
  public static boolean isSubset(int[] arrA, int[] arrB) {
    int count = 0;
    for (int i = 0; i < arrA.length; i++) {
      for (int j = 0; j < arrB.length; j++) {
        if(arrB[j] == arrA[i]) {
          count++;
          break;
        }
      }
    }
    return (count == arrA.length);
  }
}