/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #11: PS3_Ex11_RotateLeft.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class RotateLeft {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of elements: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " elements: ");
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    rotateLeft(arr);
  }
  
  // <Write a short description of the method here>
  public static void rotateLeft(int[] arr) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i-1] = arr[i];
    }
    arr[arr.length - 1] = temp;
    System.out.println(Arrays.toString(arr));
  }
}