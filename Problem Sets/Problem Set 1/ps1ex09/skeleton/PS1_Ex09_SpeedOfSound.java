/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #09: PS1_Ex09_SpeedOfSound.java
 * 
 * This program calculates the speed of sound in air of a given temperature.
 * 
 * Haowei
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class SpeedOfSound {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Temperature in degree Fahrenheit: ");
    double temperature = sc.nextDouble();

    double speed = speedOfSound(temperature);
    
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Speed = " +df.format(speed) + " ft/sec");
  }
  
  // Compute the speed of sound given temperature
  public static double speedOfSound(double temperature) {
    
    return 1086*Math.sqrt((5*temperature + 297)/247);
  }
}