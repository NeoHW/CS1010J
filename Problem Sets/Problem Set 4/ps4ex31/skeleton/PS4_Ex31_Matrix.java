/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #31: PS4_Ex31_Matrix.java
 * 
 * The Matrix class keeps a square matrx 'mtx' as its attribute,
 * and contains methods to reflect it or roate it.
 *   - rotate(deg): to rotate the matrix clockwise
 *   - reflectX() : to reflect the matrix across the x-axis
 *   - reflectY() : to reflect the matrix across the y-axis
 *   - toString() : to return String representation of the matrix
 * 
 * Haowei
 */

class Matrix {
  
  private int[][] mtx;
  
  // Constructor
  public Matrix(int[][] inMtx) {
    this.mtx = inMtx;
  }
  
  // Reflect the matrix object across the x-axis
  public void reflectX() {
    for(int row = 0; row < mtx.length/2; row++) {
      for(int col = 0; col < mtx[row].length; col++) {
        int temp = mtx[row][col];
        mtx[row][col] = mtx[mtx.length-1-row][col];
        mtx[mtx.length-1-row][col] = temp;
      }
    }
  }
  
  // Reflect the matrix object across the y-axis
  public void reflectY() {
    for(int col = 0; col < mtx[0].length/2; col++) {
      for(int row = 0; row < mtx.length; row++) {
        int temp = mtx[row][col];
        mtx[row][col] = mtx[row][mtx[0].length-1-col];
        mtx[row][mtx[0].length-1-col] = temp;
      }
    }
  }
  
  // Rotate the matrix by certain degree clockwise
  public void rotate(int degree) {
    for(int i = 0; i < degree/90; i++) {
      this.rotate90();
    }
  }
  
  // Rotate the matrix by 90 degree clockwise
  public void rotate90() {
    
    // Create a duplicated matrix
    int[][] dups = new int[mtx.length][mtx[0].length];
    for(int row = 0; row < mtx.length; row++) {
      for(int col = 0; col < mtx[0].length; col++) {
        dups[row][col] = mtx[row][col];
      }
    }

    // Rotating 90 degree
    for(int row = 0; row < mtx.length; row++) {
      for(int col = 0; col < mtx[0].length; col++) {
        mtx[row][col] = dups[mtx.length-1-col][row];
      }
    }

  }
  
  
  // Return string representation of values row by row
  public String toString() {
    
    String out = "";
    for (int row = 0; row < mtx.length; row++) {
      for (int col = 0; col < mtx[row].length; col++) {
        out += mtx[row][col] + " ";
      }
      out += "\n";
    }
    
    return out;
  }
}