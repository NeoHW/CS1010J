/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #25: PS1_Ex25_Packing.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.Scanner;

class Packing {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter size of tray: ");
    int trayHeight = sc.nextInt();
    int trayWidth = sc.nextInt();
    
    System.out.print("Enter size of slab: ");
    int slabHeight = sc.nextInt();
    int slabWidth = sc.nextInt();
    
    
    System.out.println("Minimum unused area = " + min(computeVertical(trayHeight,trayWidth,slabHeight,slabWidth),computeHortizontal(trayHeight,trayWidth,slabHeight,slabWidth)));
  }

  public static int computeVertical(int trayHeight, int trayWidth, int slabHeight, int slabWidth) {
    int totalSlabs = (trayHeight/slabHeight) * (trayWidth/slabWidth);
    int slabsArea = totalSlabs * (slabHeight * slabWidth);
    return (trayHeight * trayWidth) - slabsArea;
  }

  public static int computeHortizontal(int trayHeight, int trayWidth, int slabHeight, int slabWidth) {
    int totalSlabs = (trayHeight/slabWidth) * (trayWidth/slabHeight);
    int slabsArea = totalSlabs * (slabHeight * slabWidth);
    return (trayHeight * trayWidth) - slabsArea;
  }

  public static int min(int vertical, int horizontal) {
    if(vertical <= horizontal) {
      return vertical;
    } else {
      return horizontal;
    }
  }

}