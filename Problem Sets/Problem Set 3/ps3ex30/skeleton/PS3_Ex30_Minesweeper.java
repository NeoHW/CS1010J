/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #30: PS3_Ex30_Minesweeper.java
 * 
 * This program reads in a minefield containing mines,
 * and computes the values of the safe squares.
 * 
 * Haowei
 */

import java.util.*;

class Minesweeper {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter level (1-3): ");
    int choice = sc.nextInt();

    if(choice == 1) {
      playLevelOne(sc);
    } else if (choice == 2) {
      playLevelTwo(sc);
    } else {
      playLevelThree(sc);
    }
  }

  public static void playLevelOne(Scanner sc) {
    System.out.println("Enter the " + 8 + " x " + 8 + " board:");
    char[][] mtx = new char[8][8]; //
    readBoard(sc, mtx);
    int[][] output = new int[8][8];
    for(int i = 0; i < mtx.length; i++) {
      for(int j = 0; j < mtx[0].length; j++) {
        output[i][j] = computeScore(mtx,i,j);
      }
    }
    printBoard(output);
  }

  public static void playLevelTwo(Scanner sc) {
    System.out.println("Enter the " + 12 + " x " + 16 + " board:");
    char[][] mtx = new char[12][16]; //
    readBoard(sc, mtx);
    int[][] output = new int[12][16];
    for(int i = 0; i < mtx.length; i++) {
      for(int j = 0; j < mtx[0].length; j++) {
        output[i][j] = computeScore(mtx,i,j);
      }
    }
    printBoard(output);
  }

  public static void playLevelThree(Scanner sc) {
    System.out.println("Enter the " + 16 + " x " + 30 + " board:");
    char[][] mtx = new char[16][30]; //
    readBoard(sc, mtx);
    int[][] output = new int[16][30];
    for(int i = 0; i < mtx.length; i++) {
      for(int j = 0; j < mtx[0].length; j++) {
        output[i][j] = computeScore(mtx,i,j);
      }
    }
    printBoard(output);
  }

  public static void readBoard(Scanner sc, char[][] mtx) {
    for(int i = 0; i < mtx.length; i++) {
      String input = sc.next();
      for (int j = 0; j < input.length(); j++) {
        mtx[i][j] = input.charAt(j);
      }
    }
  }

  // Compute number of mines surronding a single tile
  public static int computeScore(char[][] mtx, int i, int j) {
    if(mtx[i][j] == '*') {
      return 9;
    }
    int count = 0;

    for(int y = -1; y < 2; y++) {
      // if first row
      if(i == 0 && y == -1) {
        y = 0;
      }
      // if exceed last row
      if(i == mtx.length-1 && y == 1) {
        break;
      }
      
      for(int x = -1; x < 2; x++) {
        // if first col
        if(j == 0 && x == -1) {
          x = 0;
        }
        // if exceed last col
        if(j == mtx[i].length-1 && x == 1) {
          break;
        }
        if(mtx[i+y][x+j] == '*') {
          count++;
        }
      }
    }
    return count;
  }

  public static void printBoard(int[][] mtx) {
    for(int i = 0; i < mtx.length; i++) {
      for( int j = 0; j < mtx[i].length; j++) {
        System.out.print(mtx[i][j]);
        if(j != mtx[i].length-1) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}