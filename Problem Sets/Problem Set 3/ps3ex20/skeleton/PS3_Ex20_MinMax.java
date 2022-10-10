/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #20: PS3_Ex20_MinMax.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class MinMax {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the matrix: ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int[][] mtx = new int[rows][columns];

    System.out.println("Enter elements row by row:");
    for(int i = 0; i < rows; i++) {
      for(int j = 0; j < columns; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    int[] tuple = getMinMax(mtx);

    System.out.println("Min = " + tuple[0]);
    System.out.println("Max = " + tuple[1]);
  }
  
  // Return the minimum and maximum values in a matrix
  public static int[] getMinMax(int[][] mtx) {
    int min = mtx[0][0], max = mtx[0][0];
    for(int i = 0; i < mtx.length; i++) {
      for(int j = 0; j < mtx[i].length; j++) {
        if(mtx[i][j] < min) {
          min = mtx[i][j];
        }
        if(mtx[i][j] > max) {
          max = mtx[i][j];
        }
      }
    }

    int[] arr = {min,max};
    return arr;
  }
}