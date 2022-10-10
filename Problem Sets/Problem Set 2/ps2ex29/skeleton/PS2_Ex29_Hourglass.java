/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #29: PS2_Ex29_Hourglass.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;


class Hourglass {   
  // Using the greedy Algorithm
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter 3 inputs: ");
    int hg1 = sc.nextInt();   // durations of hourglasses; assume hg1 < hg2
    int hg2 = sc.nextInt();
    int time = sc.nextInt();  // duration to measure; assume hg2 < time
    
    int flips1;              // number of flips needed for hourglass 1
    int flips2 = time / hg2; // number of flips needed for hourglass 2, greedy algo!
    
    while ( flips2 >= 0 && (time - flips2*hg2) % hg1 != 0 ) {
      flips2--;
    }
    
    if (flips2 < 0) {
      System.out.println("Impossible!");
    } else { // because we start from max possible flips2, it must be the best solution
      flips1 = (time - flips2*hg2) / hg1;
      System.out.println(flips1 + " flip(s) for " + hg1 + "-minute hourglass and " +
                         flips2 + " flip(s) for " + hg2 + "-minute hourglass.");
    }
  }
}


  // Own Messy method 
  /* public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter 3 inputs: ");
    int hg1 = sc.nextInt();   // durations of hourglasses; assume hg1 < hg2
    int hg2 = sc.nextInt();   
    int duration = sc.nextInt();    
    int unchangedDuration = duration;

    int flipsLong = 0;
    
    int flipsShort = 0;

    while((duration - hg2 >= hg1 || duration == hg2 || duration % hg1 == 0) && duration != 0) {
      
      // check for if any numbers is a multiple of hg1 
      if(duration % hg1 == 0 && duration % hg2 != 0 ) {
        duration -= hg1;
        flipsShort++;
        continue;
      }
      
      duration -= hg2;
      flipsLong++;
    }

    while(true) {
      // when duration is already 0
      if(duration == 0) {
        break;
      }

      // divisible by hg1
      if(duration % hg1 == 0) {
        duration -= hg1;
        flipsShort++;
      } else {
        System.out.println("Impossible!");
        break;
      }
    }
    if (flipsLong*hg2 + flipsShort*hg1 == unchangedDuration) {
      System.out.println(flipsShort + " flip(s) for " + hg1 + "-minute hourglass and " +
                         flipsLong + " flip(s) for " + hg2 + "-minute hourglass.");
    }
  } */
