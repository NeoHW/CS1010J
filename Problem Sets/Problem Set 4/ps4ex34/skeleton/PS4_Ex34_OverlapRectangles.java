/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #34: PS4_Ex34_OverlapRectangles.java
 * 
 * This program reads in a number of rectangles and computes the
 * overlap of all rectangles. This program uses the Rectangle class.
 * 
 * Haowei
 */

import java.util.*;
import java.awt.Point; // A point representing a location in (x,y) coordinate space, specified in integer precision.

class OverlapRectangles {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("How many rectangles? ");
    int num = sc.nextInt();
    Rectangle[] arr = new Rectangle[num];


    System.out.print("Enter 2 opposite vertices of first rectangle: ");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    arr[0] = new Rectangle(new Point(Math.min(x1,x2), Math.min(y1,y2)), new Point(Math.max(x1,x2), Math.max(y1,y2))); // Making sure all rectangles created are bottom-left point and top-right point

    for(int i = 1; i < num; i++) {
      System.out.print("Enter 2 opposite vertices of the next rectangle: ");
      x1 = sc.nextInt();
      y1 = sc.nextInt();
      x2 = sc.nextInt();
      y2 = sc.nextInt();
      arr[i] = new Rectangle(new Point(Math.min(x1,x2), Math.min(y1,y2)), new Point(Math.max(x1,x2), Math.max(y1,y2)));
    }
    
    
    Rectangle overlap;
    // edge case of only 1 rectangle entered
    if(num == 1){
      overlap = arr[0];
    } else {
      Point overlapPoint1 =  new Point((int)Math.max(arr[0].getVertex1().getX(), arr[1].getVertex1().getX()), (int)Math.max(arr[0].getVertex1().getY(), arr[1].getVertex1().getY()));
      Point overlapPoint2 =  new Point((int)Math.min(arr[0].getVertex2().getX(), arr[1].getVertex2().getX()), (int)Math.min(arr[0].getVertex2().getY(), arr[1].getVertex2().getY()));
      overlap = new Rectangle(overlapPoint1,overlapPoint2);

      for(int i = 2; i < num; i++) {
        overlapPoint1 =  new Point((int)Math.max(arr[i].getVertex1().getX(), overlap.getVertex1().getX()), (int)Math.max(arr[i].getVertex1().getY(), overlap.getVertex1().getY()));
        overlapPoint2 =  new Point((int)Math.min(arr[i].getVertex2().getX(), overlap.getVertex2().getX()), (int)Math.min(arr[i].getVertex2().getY(), overlap.getVertex2().getY()));
        overlap = new Rectangle(overlapPoint1,overlapPoint2);
      }
    }
    
    if(overlap.computeArea() <= 0){ // if no overlap, computed area will be negative or zero
      System.out.println("No overlap");
    } else {
      System.out.println("Overlap rectangle: " + overlap);
      System.out.println("Overlap area = " + overlap.computeArea());
    }
  }
}