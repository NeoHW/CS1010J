/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #02: PS4_Ex02_Sphere.java
 * 
 * A sphere has one attribute: radius
 * 
 * Haowei
 */

class Sphere {
  
  // Data Attribute
  private double radius;
  
  
  // Constructor
  public Sphere(double rad) {
    this.radius = rad;
  }
  
  // Return radius of a Sphere object
  public double getRadius() {
    return this.radius;
  }
  
  // Return diameter of a Sphere object
  public double computeDiameter() {
    return this.radius*2;
  }
  
  // Return circumference of a Sphere object
  public double computeCircumference() {
    return 2*Math.PI*radius;
  }
  
  // Return surface area of a Sphere object
  public double computeSurfaceArea() {
    return 4*Math.PI*Math.pow(radius, 2);
  }
  
  // Return volume of a Sphere object
  public double computeVolume() {
    return (4.0/3)*Math.PI*Math.pow(radius, 3);
  }
}