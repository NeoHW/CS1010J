/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #05: PS3_Ex05_Deviation.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

class Deviation {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    double[] arr = new double[size];

    System.out.print("Enter " + size +" elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextDouble();
    }

    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Standard deviation is: " + df.format(computeDeviation(arr)));
  }
  
  // <Write a short description of the method here>
  public static double computeDeviation(double[] val) {

    return Math.sqrt(numerator(val)/val.length);
  }
  
  // <Write a short description of the method here>
  public static double average(double[] val) {
    
    double sum = 0;
    for(int i = 0; i < val.length; i++) {
      sum += val[i];
    }
    return sum/val.length;
  }

  public static double numerator(double[] val) {
    
    double mean = average(val);
    double sum = 0;

    for (int i = 0; i < val.length; i++) {
      sum += Math.pow(val[i] - mean, 2);
    }
    return sum;
  }
}