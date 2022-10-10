/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #26: PS3_Ex26_BlackWhiteImage.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class BlackWhiteImage {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the image: ");
    int length = sc.nextInt();

    int [][] mtx = new int[length][length];
    System.out.println("Enter image:");
    for(int i = 0; i < length; i++){
      for(int j = 0; j < length; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    System.out.print("Enter choice:\n(1) flip\n(2) rotate\n");
    int choice = sc.nextInt();

    System.out.println("Original image:");
    printOriginal(mtx);
    if(choice == 1) {
      System.out.println("Flipped image:");
      flip(mtx);
    } else if (choice == 2) {
      System.out.println("Rotated image:");
      rotate(mtx);
    }
  }

  public static void printOriginal(int[][] mtx) {
    for(int i = 0; i < mtx.length; i++){
      for(int j = 0; j < mtx[i].length; j++) {
        System.out.print(mtx[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void flip(int[][] mtx) {
    for(int i = mtx.length-1 ; i >= 0; i--) {
      for(int j = 0; j < mtx[i].length; j++) {
        System.out.print(mtx[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void rotate(int[][] mtx) {
    
    // immediately print rotated matrix
    for(int i = 0; i < mtx.length; i++) {
      for (int j = 0; j < mtx.length; j++) {
        System.out.print(mtx[mtx.length-1-j][i] + " ");
      }
      System.out.println();
    }

    // Longer method of creating matrix and printing it
    /** 
    int[][] newMtx = new int[mtx.length][mtx.length];
    for(int i = 0; i < mtx.length; i++) {
      for (int j = 0; j < mtx.length; j++) {
        newMtx[i][j] = mtx[mtx.length-1-j][i];
      }
    }

    for(int i = newMtx.length-1 ; i >= 0; i--) {
      for(int j = 0; j < newMtx[i].length; j++) {
        System.out.print(newMtx[i][j] + " ");
      }
      System.out.println();
    }
    */

    /** Method to find out how to rotate matrix
    0,0 <- 4,0
    0,1 <- 3,0
    0,2 <- 2,0
    0,3 <- 1,0
    0,4 <- 0,0


    1,0 <- 4,1
    1,1 <- 3,1
    1,2 <- 2,1
    1,3 <- 1,1
    1,4 <- 0,1
    */
  }
}