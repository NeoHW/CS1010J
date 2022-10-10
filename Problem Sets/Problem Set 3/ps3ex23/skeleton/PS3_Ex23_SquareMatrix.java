/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #23: PS3_Ex23_SquareMatrix.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class SquareMatrix {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of the square matrix: ");
    int rows = sc.nextInt();
    int[][] mtx = new int[rows][rows];
    
    System.out.println("Enter elements row by row:");
    for(int i = 0; i < rows; i++){
      for (int j = 0; j < rows; j++){
        mtx[i][j] = sc.nextInt();
      }
    }

    if(isDiagonalMatrix(mtx)){
      System.out.println("Given matrix is a diagonal matrix.");
    } else {
      System.out.println("Given matrix is not a diagonal matrix.");
    }
    
    if(isUTR(mtx)){
      System.out.println("Given matrix is an upper triangular matrix.");
    } else {
      System.out.println("Given matrix is not an upper triangular matrix.");
    }
  }

  public static boolean isDiagonalMatrix(int[][] mtx) {
    for(int i = 1; i < mtx.length; i++){
      for(int j = 0; j < mtx[i].length; j++) {
        if(i == j){
          continue;
        }
        if(mtx[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean isUTR(int[][] mtx) {
    for(int i = 1; i < mtx.length; i++){
      for(int j = 0; j < i; j++) {
        if(mtx[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }

}