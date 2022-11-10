/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #29: PS4_Ex29_Ball.java
 * 
 * Ball class has two attributes: colour and radius.
 * 
 * Haowei
 */

class Ball {
  
  private String colour;
  private double radius;
  
  public Ball(String colour, double radius) {
    this.colour = colour;
    this.radius = radius;
  }
  
  // Return colour of a ball
  public String getColour() {
    return this.colour;
  }
  
  // Return radius of a ball
  public double getRadius() {
    return this.radius;
  }
  
  // Compare this ball with another.
  // Return true if they have the same values, or false otherwise
  public boolean equals(Ball another) {
    return (this.colour.equalsIgnoreCase(another.colour) && this.radius == another.radius);
  }
  
  // Return e.g. "[colour = Red, radius = 5]"
  public String toString() {
    return "[colour = " + this.colour + ", radius = " + this.radius + "]";
  }
}