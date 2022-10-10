/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: PS1_Ex08_Coins.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.Scanner;

class Coins {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter amount in cents: ");
    int cents = sc.nextInt();
    int count = 0;

    while (cents > 0) {
      if (cents >= 100) {
        cents -= 100;
        count++;
      } else if (cents >= 50) {
        cents -= 50;
        count++;
      } else if (cents >= 20) {
        cents -= 20;
        count++;
      } else if (cents >= 10) {
        cents -= 10;
        count++;
      } else if (cents >= 5) {
        cents -= 5;
        count++;
      } else if (cents >= 1) {
        cents -= 1;
        count++;
      }
    }

    
    System.out.println("Minimum number of coins needed: " + count);
  }
}