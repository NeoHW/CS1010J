/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #21: PS1_Ex21_BMI.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class BMI {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your gender (0 for female, 1 for male): ");
    int gender = sc.nextInt();
    
    System.out.print("Enter your weight (kg) and height (m): ");        
    double weight = sc.nextDouble();
    double height = sc.nextDouble();
    
    int body = bodyType(gender, weight, height);
    
    if (body == -1) {
      System.out.println("Stuff yourself with more food!");
    } else if (body == 0) {
      System.out.println("Great! Maintain it!");
    } else {
      System.out.println("Time to join the gym!");
    }
  }
  
  // <Write a short description of the method here>
  public static int bodyType(int gender, double weight, double height) {
    
    double bmi = weight / Math.pow(height, 2);

    if (gender == 0) {
      if(bmi <= 19) {
        return -1;
      } else if (bmi <= 24) {
        return 0;
      } else {
        return 1;
      }
    } else {
      if(bmi <= 20) {
        return -1;
      } else if (bmi <= 25) {
        return 0;
      } else {
        return 1;
      }
    }
  }
  
}