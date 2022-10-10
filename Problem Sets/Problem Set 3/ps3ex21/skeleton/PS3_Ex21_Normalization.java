/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #21: PS3_Ex21_Normalization.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class Normalization {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the matrix: ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    int[][] mtx = new int[rows][columns];
    System.out.println("Enter elements row by row:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    int[] arr = getMinMax(mtx);
    int min = arr[0];
    int max = arr[1];


    double[][] normalisedMtx = normalise(mtx,rows,columns,min,max);
    printMatrix(normalisedMtx);

  }
  
  // Returns a tuple containing min and max
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

  // Changes matrix to normalised matrix
  public static double[][] normalise(int[][] mtx, int rows, int columns, int min, int max) {
    
    double[][] normalisedMtx = new double[rows][columns];
    for(int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        normalisedMtx[i][j] = ((double)mtx[i][j] - min) / (max - min);
      }
    }
    return normalisedMtx;
  }


  // Print out a matrix ,, have space after end of each row, no new line at the bottom of matrix
  public static void printMatrix(double[][] mtx) {
    
    DecimalFormat df = new DecimalFormat("0.00");

    String str = "";
    for(int i = 0; i < mtx.length; i++){
      for (int j = 0; j < mtx[i].length; j++) {
        str = str + df.format(mtx[i][j]) + " ";
        if(j == mtx[i].length -1 && i != mtx.length -1) {
          str = str + "\n";
        }
      }
    }
    System.out.println("Normalized matrix:");
    System.out.println(str);
  }
}