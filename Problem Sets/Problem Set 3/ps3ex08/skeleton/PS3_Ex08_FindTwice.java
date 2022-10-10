/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #08: PS3_Ex08_FindTwice.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class FindTwice {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int result = findTwice(arr);
    if(result == -1) {
      System.out.println("Array doesn't contain duplicated data");
    } else {
      System.out.println(arr[result] + " is the first element that appears at least twice"); 
    }
    
  }
  
  // <Write a short description of the method here>
  public static int findTwice(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      for(int j = i+1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return i;
        }
      }
    }
    return -1;
  }
}