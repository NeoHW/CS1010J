/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #17: PS3_Ex17_SortThreeDigits.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class SortThreeDigits {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int size = sc.nextInt();

    System.out.print("Enter " + size + " elements: ");
    int[] arr = new int[size];
    for(int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    sortArray(arr);
    
    System.out.println("Sorted array: " + Arrays.toString(arr));
    
  }
  
  // Bubble sort the given array according to the first 3 digits
  public static void sortArray(int[] arr) {
    boolean swapped;
    int temp;
    for (int i = 0; i < arr.length; i++) {
      swapped = false;
      for (int j = 0; j < arr.length-1-i; j++) {
        if(moreThan(arr[j], arr[j+1])) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }
      }
      if(swapped == false) {
        break;
      }
    }
  }
  
  // Compare num1 with num2 according to their first 3 digits.
  // Return true if num1 is bigger, or false otherwise
  public static boolean moreThan(int num1, int num2) {
    
    while(num1 >= 1000) {
      num1 /= 10;
    }
    while(num2 >= 1000) {
      num2 /= 10;
    }

    return (num1 > num2);
  }
}