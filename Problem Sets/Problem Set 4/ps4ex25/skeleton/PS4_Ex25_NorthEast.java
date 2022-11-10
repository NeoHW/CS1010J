/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #25: PS4_Ex25_NorthEast.java
 * 
 * This program counts the number of valid north-east paths.
 * 
 * Haowei
 */

import java.util.*;

class NorthEast {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter rows and columns apart: ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    
    System.out.println("Number of NE-paths = " + ne(row,col));
  }
  
  // Count the number of valid north-east paths
  // Pre-cond: x >= 0, y >= 0
  public static int ne(int x, int y) {

    // Base case : 1 path if ONLY upwards left or ONLY rightwards left
    if (x == 0 || y == 0) {
      return 1;
    } else {
      return ne(x-1, y) + ne(x, y-1);
    }


    /** Own Method

    // x is number of upward moves away
    // y is number of rightward moves away
    if(x == 0 & y == 0) {
      return 1;
    } else if(x == 0) {
      return ne(x,y-1);
    } else if (y == 0) {
      return ne(x-1,y);
    } else {
      return ne(x,y-1) + ne(x-1,y);
    }
    */
  }
}