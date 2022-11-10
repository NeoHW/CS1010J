/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: Lift.java
 * 
 * This program contains a Lift class that models a lift.
 * 
 * Haowei
 */

class Lift {
  
  private int currLevel, distance;  // current level and travel distance
  
  // SPEED is defined as a constant and can be used in Lift class directly
  private final int SPEED = 2;  // two seconds per level
  
  // Constructor
  public Lift() {
    this.currLevel = 1;
    this.distance = 0;
  }
  
  // Move lift to fromLevel to pick up passenger and then
  // send passenger to toLevel
  public void move(int fromLevel, int toLevel) {
    this.distance += Math.abs(this.currLevel - fromLevel);
    this.currLevel = fromLevel;
    this.distance += Math.abs(this.currLevel - toLevel);
    this.currLevel = toLevel;
  }
  
  // Return current level
  public int getLevel() {
    return this.currLevel;
  }
  
  // Return the time a lift has travelled
  public int getTime() {
    return this.distance*SPEED;
  }
}