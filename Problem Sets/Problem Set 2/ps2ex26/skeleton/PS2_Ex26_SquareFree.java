/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #26: PS2_Ex26_SquareFree.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class SquareFree {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter four positive integers: ");        
    
    int firstLow = sc.nextInt();
    int firstHigh = sc.nextInt();
    int secondLow = sc.nextInt();
    int secondHigh = sc.nextInt();
    
    int first = numSquareFree(firstLow, firstHigh);
    int second = numSquareFree(secondLow, secondHigh);
    
    if(first > second) {
      System.out.println("Range [" + firstLow + ", " + firstHigh + "] has more square-free numbers: " + first);
    } else if (second > first) {
      System.out.println("Range [" + secondLow + ", " + secondHigh + "] has more square-free numbers: " + second);
    } else {
      System.out.println("Both ranges have the same number of square-free numbers: " + second);
    }
  }
  
  // Return the number of square free integers
  // in the range [lower, upper] (both inclusive).
  public static int numSquareFree(int lower, int upper) {
    
    // Finding all squared numbers up to upper limit
    ArrayList <Integer> listOfSquares = new ArrayList<Integer>();

    for(int i = 0; i <= upper; i++) {
      
      if(isSquare(i)) {
        listOfSquares.add(i);
      }
    }

    // count number of NOT square-free ints in range
    int count = 0;

    if(listOfSquares.size() != 0) {
      for(int i = lower; i <= upper; i++ ){
        for(int n = 1; n < listOfSquares.size(); n++) {       // start from n = 1 as the number 1 is NOT a squared number
          if(i % listOfSquares.get(n) == 0) {
            count++;
            break;
          }
        }
      }
    }

    int rangeLength = upper - lower + 1;
    return rangeLength-count;
  }

  

  public static boolean isSquare(int number) {
    double root = Math.sqrt(number);
    return (root / (int)root == 1);
  }
}