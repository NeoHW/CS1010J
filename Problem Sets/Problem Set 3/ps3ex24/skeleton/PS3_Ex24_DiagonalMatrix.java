/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #24: PS3_Ex24_DiagonalMatrix.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class DiagonalMatrix {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the square matrix: ");
    int size = sc.nextInt();

    System.out.println("Enter elements row by row:");
    int[][] mtx = new int[size][size];
    for(int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        mtx[i][j] = sc.nextInt();
      }
    }

    if(isDescDiagonal(mtx)) {
      System.out.println("Given matrix is a descending diagonal matrix.");
    } else {
      System.out.println("Given matrix is not a descending diagonal matrix.");
    }
    
    if(isAntiDiagonal(mtx)) {
      System.out.println("Given matrix is an anti-diagonal matrix.");
    } else {
      System.out.println("Given matrix is not an anti-diagonal matrix.");
    }
    
  }

  public static boolean isDescDiagonal(int[][] mtx) {
    int tester = mtx[0][0];

    for(int i = 0; i < mtx.length; i++) {
      for(int j = 0; j < mtx[i].length; j++) {
        // testing for descending
        if(i == 0 && j == 0){
          continue;
        }
        if(i == j) {
          if(mtx[i][j] != tester - 1) {
            return false;
          }
          tester--;
          continue;
        }
        // testing for non-diagonal values == 0
        if(mtx[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean isAntiDiagonal(int[][] mtx) {
    for(int i = 0; i < mtx.length; i++) {
      int antiDiagonalColumn = mtx.length - 1 - i;
      for(int j = 0; j < mtx[i].length; j++) {
        // skipping the anti-diagonals
        if(antiDiagonalColumn == j){
          continue;
        }
        // testing for non-diagonal values == 0
        if(mtx[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }
}