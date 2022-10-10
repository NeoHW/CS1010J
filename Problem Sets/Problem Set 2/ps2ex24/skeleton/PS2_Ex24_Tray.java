/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #24: PS2_Ex24_Tray.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Tray {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter size of tray: ");
    double length = sc.nextDouble();
    double width = sc.nextDouble();
    
    System.out.println("Minimum perimeter after folding = " + minPeri(length,width));
  }

  public static double minPeri(double length, double width) {
    for (int i = 0; i < 3; i++) {
      if(length >= width) {
        length /= 2;
      } else {
        width /= 2;
      }
    }
    return length*2 + width*2;
  }
}