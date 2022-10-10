/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #25: PS3_Ex25_MaxPairFrequency.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class MaxPairFrequency {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of the matrix: ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int[][] mtx = new int[rows][columns];
    System.out.println("Enter elements row by row:");
    for(int i = 0 ; i < rows; i++){
      for (int j = 0; j < columns; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    int max = getMaxPairFrequency(mtx);
    System.out.println("Maximum number of pairs = " + max);
  }

  public static int getMaxPairFrequency(int[][] mtx) {
    int[] arr = new int[10];
    int max = 0;

    for(int i = 0; i < mtx.length; i++) {
      for(int j = 0; j < mtx[i].length; j++) {
        if(i != mtx.length-1) {
          //comparing row & row+1
          if(mtx[i][j] == mtx[i+1][j]) {
            arr[mtx[i][j]]++;
          }
        }
        if(j != mtx[i].length-1) {
          //comparing column & column+1
          if(mtx[i][j] == mtx[i][j+1]) {
            arr[mtx[i][j]]++;
          }
        }
      }
    }

    for(int i = 0; i < 10; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }

    return max;
  }
}