/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #07: PS3_Ex07_ReverseArray.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class ReverseArray {
  
  public static void main(String[] args) {

    int[] arr = readArray();
    
    reverseArray(arr);
    
    System.out.println("Reversed: " + Arrays.toString(arr));
    // Refer to lecture 7 notes how to use Arrays.toString    
  }
  
  // Read and return an array
  public static int[] readArray() {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("How many values in the array? ");
    int size = sc.nextInt();
    
    int[] arr = new int[size];

    System.out.print("Enter " + size + " values: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    return arr;
  }
  
  // <Write a short description of the method here>
  public static void reverseArray(int[] arr) {
    int temp;
    int size = arr.length;
    for (int i = 0; i < size/2 ; i++) {
      temp = arr[i];
      arr[i] = arr[size-1-i];
      arr[size-1-i] = temp;
    }
  }
}