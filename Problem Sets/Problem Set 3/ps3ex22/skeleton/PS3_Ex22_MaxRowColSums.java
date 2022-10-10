/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #22: PS3_Ex22_MaxRowColSums.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class MaxRowColSums {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of the matrix: ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int[][] mtx = new int[rows][columns];
    System.out.println("Enter elements row by row:");
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    int maxRowSum = getMaxRowSum(mtx);
    int maxColSum = getMaxColSum(mtx);

    System.out.println("Max row sum = " + maxRowSum);
    System.out.println("Max col sum = " + maxColSum);
  }

  public static int getMaxRowSum(int[][] mtx) {
    int max = 0;
    // Get first row sum
    for(int column = 0; column < mtx[0].length; column++) {
      max += mtx[0][column];
    }

    // Compare other row sums
    for(int row = 1; row < mtx.length; row++){
      int temp = 0;
      for(int column = 0; column < mtx[row].length; column++) {
        temp += mtx[row][column];
      }
      if (temp > max) {
        max = temp;
      }
    }
    return max;
  }

  public static int getMaxColSum(int[][] mtx) {
    int max = 0;
    // Get first col sum
    for(int i = 0; i < mtx.length; i++) {
      max += mtx[i][0];
    }

    // Compare other row sums
    for(int j = 1; j < mtx[0].length; j++){
      int temp = 0;
      for(int i = 0; i < mtx.length; i++) {
        temp += mtx[i][j];
      }
      if (temp > max) {
        max = temp;
      }
    }
    return max;
  }
}