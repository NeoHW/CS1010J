/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #06: PS4_Ex06_Car.java
 * 
 * This program uses Car class. It reads in a car's information,
 * and creates a Car object. It then reads a list of trips, updates
 * the odometer reading, and computes the average distance travelled per trip.
 * 
 * Haowei
 */

import java.util.*;
import java.text.DecimalFormat;

class TestCar {
  
  public static void main(String[] args) {
    
    double totalDistance = 0;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");
    
    System.out.print("Enter model: ");
    String model = sc.nextLine();
    
    System.out.print("Enter colour: ");
    String colour = sc.nextLine();
    
    System.out.print("Enter odometer value: ");
    double value = sc.nextDouble();
    
    // create a car object with 3 values read
    Car car = new Car(model, colour, value);
    
    System.out.print("Enter the number of trips: ");
    int trips = sc.nextInt();
    for (int i = 1; i <= trips; i++) {
      System.out.print("Distance for trip " + i + ": ");
      double distance = sc.nextDouble();
      totalDistance += distance;
      car.updateOdometer(distance);
    }

    System.out.println("Model: " + car.getModel());
    System.out.println("Colour: " + car.getColour());
    System.out.println("Odometer: " + car.getOdometer());
    
    System.out.println("Trips: " + trips);
    // average distance
    System.out.println("Distance per trip: " + df.format((totalDistance/trips)));
  }
}