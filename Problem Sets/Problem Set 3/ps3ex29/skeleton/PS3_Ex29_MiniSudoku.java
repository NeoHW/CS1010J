/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #29: PS3_Ex29_MiniSudoku.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class MiniSudoku {  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int[][] mtx = new int[4][4];

    System.out.println("Enter board (0 for blank cell):");
    for(int i = 0; i < 4; i++) {
      for (int j = 0; j < 4 ; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    solve(mtx);
    System.out.println("The Sudoku puzzle solved:");
    printMatrix(mtx);
  }

  public static void solve(int[][] mtx) {
    boolean solved = false;
    while (solved != true) {
      solveRows(mtx);
      solveColumns(mtx);
      solveMiniSquare(mtx);
      if(boardCompleted(mtx)){
        solved = true;
      }
    }
  }

  public static void solveRows(int[][] mtx) {
    for(int i = 0; i < 4; i++) {
      int count = 0;
      // count number of 0 in each row
      for(int j = 0; j < 4; j++) {
        if(mtx[i][j] == 0 ) {
          count++;
        }
      }
      // if there is exactly one 0
      if(count == 1) {
        int sum = 1 + 2 + 3 + 4;
        int index = -1; // filler number
        for(int j = 0; j < 4; j++) {
          if(mtx[i][j] != 0) {
            sum -= mtx[i][j];
          } else {
            index = j;
          }
        }
        // fill in missing number into [index]
        mtx[i][index] = sum;
      }
    }
  }

  public static void solveColumns(int[][] mtx) {
    for(int j = 0; j < 4; j++) {
      int count = 0;
      // count number of 0 in each column
      for(int i = 0; i < 4; i++) {
        if(mtx[i][j] == 0 ) {
          count++;
        }
      }
      // if there is exactly one 0
      if(count == 1) {
        int sum = 1 + 2 + 3 + 4;
        int index = -1; // filler number
        for(int i = 0; i < 4; i++) {
          if(mtx[i][j] != 0) {
            sum -= mtx[i][j];
          } else {
            index = i;
          }
        }
        // fill in missing number into [index]
        mtx[index][j] = sum;
      }
    }
  }

  public static void solveMiniSquare(int[][] mtx) {
      // Solving top 4 left box
      solveSquare(mtx,0,0);
      // Solving top 4 right box
      solveSquare(mtx,0,2);
      // Solving bottom 4 left box
      solveSquare(mtx,2,0);
      // Solving bottom 4 right box
      solveSquare(mtx,2,2);
  }

  public static void solveSquare(int[][] mtx, int i, int j) {
    int iMax = i+2;
    int jMax = j+2;
    int count = 0;

    for(int iOne = i; iOne < iMax; iOne++){
      for(int jOne = j; jOne < jMax; jOne++) {
        if(mtx[iOne][jOne] == 0 ) {
          count++;
        }
      }
    }
    // if exactly one zero
    if(count == 1) {
        int sum = 1 + 2 + 3 + 4;
        int iIndex = -1; // filler number
        int jIndex = -1; // filler number
        for(int iTwo = i; iTwo < iMax; iTwo++) {
          for(int jTwo = j; jTwo < jMax; jTwo++) {
            if(mtx[iTwo][jTwo] != 0) {
              sum -= mtx[iTwo][jTwo];
            } else {
              iIndex = iTwo;
              jIndex = jTwo;
            }
          }
        }
         // fill in missing number into [index]
         mtx[iIndex][jIndex] = sum;
      }

  }


  public static boolean boardCompleted(int[][] mtx) {
    for(int i = 0; i < 4; i++) {
      for (int j = 0; j < 4 ; j++) {
        if(mtx[i][j] == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static void printMatrix(int[][] mtx) {
    for (int i = 0 ; i < 4 ; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(mtx[i][j] + " ");
      }
      System.out.println();
    }
  }
}