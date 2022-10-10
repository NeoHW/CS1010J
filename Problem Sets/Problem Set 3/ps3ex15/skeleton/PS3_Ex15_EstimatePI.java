/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #15: PS3_Ex15_EstimatePI.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class EstimatePI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0000");

    System.out.print("Enter the size of the list: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.print("Enter " + size + " elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Estimated pi = " + df.format(estimatePI(arr)));
  }

  // Takes in an integer array and returns a double
  public static double estimatePI(int[] arr) {
    
    int totalPairs = arr.length*(arr.length-1)/2;

    int count = 0; // for counting pairs with no common factor other than 1
    
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if(gcdBySteinsAlgorithm(arr[i],arr[j]) == 1) {
          count++;
        }
      }
    }
    double resultSquared = (6 * totalPairs)/(double)count;
    double result = Math.sqrt(resultSquared);
    return result;
  }

  // Takes in 2 integers and returns an integer containing the greatest common divisor
  public static int gcdBySteinsAlgorithm(int n1, int n2) {
      if (n1 == 0) {
          return n2;
      }
  
      if (n2 == 0) {
          return n1;
      }
  
      int n;
      for (n = 0; ((n1 | n2) & 1) == 0; n++) {
          n1 >>= 1;
          n2 >>= 1;
      }
  
      while ((n1 & 1) == 0) {
          n1 >>= 1;
      }
  
      do {
          while ((n2 & 1) == 0) {
              n2 >>= 1;
          }
  
          if (n1 > n2) {
              int temp = n1;
              n1 = n2;
              n2 = temp;
          }
          n2 = (n2 - n1);
      } while (n2 != 0);
      return n1 << n;
  }

}