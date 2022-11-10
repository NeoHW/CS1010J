/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #06: PS4_Ex06_Car.java
 * 
 * Define a Car class consisting of three attributes:
 * model, colour, and odometer reading.
 * 
 * Haowei
 */

import java.text.DecimalFormat;

class Car {

  // Attributes
  private String model;
  private String colour;
  private double odoVal;

  // Constructor
  public Car(String mod, String col, double odo) {
    this.model = mod;
    this.colour = col;
    this.odoVal = odo;
  }
  
  // Return the model of a Car object
  public String getModel() {
    return this.model;
  }
  
  // Return the colour of a Car object
  public String getColour() {
    return this.colour;
  }
  
  // Return the odometer value of a Car object
  public double getOdometer() {
    return this.odoVal;
  }
  
  // Update the odometer with the distance travelled
  public void updateOdometer(double distance) {
    this.odoVal = (this.odoVal+distance) % 1000; // 1000 not 999.9
  }
}