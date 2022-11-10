/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #05: PS4_Ex05_MyPoint.java
 * 
 * This class provides various routines to
 * manipulate points in the coordinate plane (x, y).
 * 
 * Haowei
 */

import java.text.*;

class MyPoint {
  
  DecimalFormat df = new DecimalFormat("0.000");
  // The x- and y- coordinates of a point
  private double xCoord, yCoord;
  
  // Constructor
  public MyPoint(double xInit, double yInit) {
    this.xCoord = xInit;
    this.yCoord = yInit;
  }
  
  // Return the x-coordinate of a point
  public double getX() {
    return this.xCoord;
  }
  
  // Return the y-coordinate of a point
  public double getY() {
    return this.yCoord;
  }
  
  // Change the value of the x-coordinate of a point
  public void setX(double x) {
    this.xCoord = x;
  }
  
  // Change the value of the y-coordinate of a point
  public void setY(double y) {
    this.yCoord = y;
  }
  
  // Compute the Euclidean distance between 'this' and 'another' points
  public double distanceTo(MyPoint another) {
    return Math.sqrt(Math.pow(this.xCoord - another.xCoord, 2) + Math.pow(this.yCoord - another.yCoord, 2));
  }
  
  // Compute the area of a rectangle whose sides are
  // parallel to the x- or y-axis and has 'this' and
  // 'another' points as two opposite corners.
  public double computeRectArea(MyPoint another) {
    return Math.abs((this.xCoord-another.xCoord) * (this.yCoord - another.yCoord));
  }
  
  // Return string representation of a point
  // Format: (x, y) where x and y are shown in 3 decimal places
  public String toString() {
    return "(" + df.format(this.xCoord) + ", " + df.format(this.yCoord) + ")";
  }
}