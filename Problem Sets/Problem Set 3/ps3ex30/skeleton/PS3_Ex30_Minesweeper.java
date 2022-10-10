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

    // Note the expected output format for each line, e.g.
    // 1<space>2<space>1<space>9<space>5<space>3<space>3<space>5
  }

  public static void playLevelOne(Scanner sc) {
    System.out.println("Enter the " + 8 + " x " + 8 + " board:");
    char[][] mtx = new char[8][8];
    readBoard(sc, mtx);
    int[][] output = new int[8][8];
    for(int i = 0; i < mtx.length; i++) {
      for( int j = 0; j < mtx.length; j++) {
        output[i][j] = computeScore(mtx,i,j);
      }
    }
    printBoard(output);
  }

  public static void playLevelTwo(Scanner sc) {
    return;
  }

  public static void playLevelThree(Scanner sc) {
    return;
  }

  // Errors here
  // Learn how to convert String into Char Matrix!!
  public static void readBoard(Scanner sc, char[][] mtx) {
    for(int i = 0; i < mtx.length; i++) {
      String s = sc.nextLine();
      for(int j = 0; j < mtx.length; j++) {
        mtx[i][j] = s.charAt(j);
      }
    }
  }

  public static int computeScore(char[][] mtx, int i, int j) {
    if(mtx[i][j] == '*') {
      return 9;
    }
    int count = 0;
    int y = -1;
    int x = -1;
    boolean yEnd = false;
    boolean xEnd = false;

    while(y < 2 && yEnd == false) {
      if(i == 0) {
        y = 0;
      }

      if(i == 7 && y == 1) {
        yEnd = true;
      }

      while (x < 2 && xEnd == false) {
        if(j == 0) {
          x = 0; 
        }  
        if(j == 7 && x == 1) {
          xEnd = true;
        }
        if(mtx[i+y][x+j] == '*') {
          count++;
        }
        x++;
      }
      if(mtx[i+y][x+j] == '*') {
        count++;
      }
      y++;
    }
    return count;
  }

  public static void printBoard(int[][] mtx) {
    for(int i = 0; i < mtx.length; i++) {
      for( int j = 0; j < mtx.length; j++) {
        System.out.print(mtx[i][j] + " ");
      }
    }
    System.out.println();
  }
}