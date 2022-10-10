/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #12: PS3_Ex12_RotateRightK.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class RotateRightK {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of elements: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " elements: ");
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Enter k: ");
    int k = sc.nextInt();
    
    rotateRightK(arr,k);
  }
  
  // <Write a short description of the method here>
  public static void rotateRightK(int[] arr, int k) {
    for (int i = 0; i < k; i++) {
      rotateRight(arr);
    }
    System.out.println(Arrays.toString(arr));
  }
  
  // <Write a short description of the method here>
  public static void rotateRight(int[] arr) {
    int size = arr.length;
    int temp = arr[size-1];
    for (int i = size - 2 ; i >= 0; i--) {
      arr[i+1] = arr[i];
    }
    arr[0] = temp;
  }
}