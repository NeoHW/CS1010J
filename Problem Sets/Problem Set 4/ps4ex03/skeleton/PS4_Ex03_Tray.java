/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #03: PS4_Ex03_Tray.java
 * 
 * A rectangle tray has two attributes: length and width.
 * 
 * Haowei
 */

class Tray {
  
  // Attributes
  private double length;
  private double width;
  
  // Constructor
  public Tray(double side1, double side2) {
    this.length = side1;
    this.width = side2;
  }
  
  // Fold a tray into halves once, either along the x-axis or the y-axis
  // such that the resulting tray has minimum perimeter.
  public void fold() {
    if(this.length >= this.width) {
      this.length /= 2;
    } else {
      this.width /= 2;
    }
  }
  
  // Return the perimeter of a tray object
  public double computePerimeter() {
    return 2*this.length + 2*this.width;
  }
}