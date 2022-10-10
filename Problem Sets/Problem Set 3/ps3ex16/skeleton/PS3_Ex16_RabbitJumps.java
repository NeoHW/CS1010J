/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #16: PS3_Ex16_RabbitJumps.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class RabbitJumps {  
  public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of rocks: ");
    int rocks = sc.nextInt();

    System.out.print("Enter locations of " + rocks + " rocks: ");
    int[] arr = new int[rocks];
    for(int i = 0 ; i < rocks; i++) {
      arr[i] = sc.nextInt();
    }


    // Check distance between platform and first rock too!
    if( arr[0] - 0  > 50 || countJumps(arr) == -1) {
      System.out.println("Impossible");
    } else {
      System.out.println(countJumps(arr) + " jumps");
    }
  }

  public static int countJumps(int[] arr) {
    // checking distances between rocks
    for (int i = 1 ; i < arr.length; i++) {
      if(arr[i] - arr[i-1] > 50) {
        return -1;
      }
    }
    int count = 0;
    int currentPosition = 0;
    int maxNextJump = currentPosition + 50;
    
    while(currentPosition != arr[arr.length -1]){
      for(int i = arr.length - 1; i >= 0; i--) {
        if(arr[i] > maxNextJump) {
          continue;
        }
        count++;
        currentPosition = arr[i];
        maxNextJump = currentPosition + 50;
        break;
      }
    }
    return count;
  }

}