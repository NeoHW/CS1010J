/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #10: PS3_Ex10_Tuple.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Tuple {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of distinct elements in sorted array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " elements: ");
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter key: ");
    int key = sc.nextInt();

    if(checkTuple(arr, key)){
      System.out.println("Exist");
    } else {
      System.out.println("Not exist");
    }
  }
  
  // Do not use a nested loop, 2 pointers method?
  public static boolean checkTuple(int[] arr, int key) {
    int sum = 0;
    int start = 0;
    int end = arr.length - 1;
    while(sum != key) {
      sum = arr[start] + arr[end];
      if (sum < key) {
        start++;
      } else if (sum > key) {
        end--;
      }
      if(start == end) {
        break;
      }
    }
    return(start != end);

  }
}