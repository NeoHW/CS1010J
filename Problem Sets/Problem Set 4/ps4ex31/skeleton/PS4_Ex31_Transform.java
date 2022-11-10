/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #31: PS4_Ex31_Transform.java
 * 
 * This program creates a Matrix object, reflects it across the x- or y- axis,
 * or rotates it by d degree clockwise where d can be 90, 180, or 270.
 * 
 * Haowei
 */

import java.util.*;

class Transform {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the square matrix: ");
    int size = sc.nextInt();
    
    System.out.println("Enter elements row by row:");
    int[][] mtx = new int[size][size];
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }

    Matrix matrix = new Matrix(mtx);

    System.out.print("Enter the number of commands: ");
    int numCommands = sc.nextInt();
    sc.nextLine(); // consume \n

    for(int i = 0; i < numCommands; i++) {
      System.out.print("Enter command: ");
      String command = sc.nextLine();
      switch(command) {
        case "Reflect x":
          matrix.reflectX();
          break;
        case "Reflect y":
          matrix.reflectY();
          break;
        case "Rotate 90":
          matrix.rotate(90);
          break;
        case "Rotate 180":
          matrix.rotate(180);
          break;
        case "Rotate 270":
          matrix.rotate(270);
          break;
      }
    }
    System.out.print(matrix);
  }
}