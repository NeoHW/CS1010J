/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: OperateLifts.java
 * 
 * This program receives instructions on two
 * lifts and move them from one level to another.
 * 
 * Haowei
 */

import java.util.*;

class OperateLifts {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    Lift liftOne = new Lift();
    Lift liftTwo = new Lift();

    
    System.out.print("How many instructions? ");
    int numberOfInstrucitons = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Enter " + numberOfInstrucitons + " instructions:");
    for (int i = 0; i < numberOfInstrucitons; i++) {
      String input = sc.nextLine();
      String[] parts = input.split(" ");
      if(parts[0].equals("1")) {
        liftOne.move(Integer.valueOf(parts[1]), Integer.valueOf(parts[2]));
      } else {
        liftTwo.move(Integer.valueOf(parts[1]), Integer.valueOf(parts[2]));
      }
    }
    
    System.out.println("lift 1 took " + liftOne.getTime() + " seconds and ended at level " + liftOne.getLevel());
    System.out.println("lift 2 took " + liftTwo.getTime() + " seconds and ended at level " + liftTwo.getLevel());
  }
}