/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #13: PS3_Ex13_SoftToys.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class SoftToys {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("How long will the campaign last: ");
    int length = sc.nextInt();
    int[] arr = new int[length];

    System.out.print("Enter type of toys in each day: ");
    for (int i = 0; i < length; i++) {
      arr[i] = sc.nextInt();
    }

    int result = whichDay(arr);

    if(result == -1) {
      System.out.println("Kitty is unable to collect all types of toys");
    } else {
      System.out.println("Kitty is able to collect all types of toys on day " + result);
    }
  }
  
  // <Write a short description of the method here>
  public static int whichDay(int[] types) {
    
    int count = 0;
    int answer = -1;
    boolean[] collectedTypes = new boolean[5];  // false by default
    
    for (int i = 0; i <= (types.length - 2); i += 2) {
      if (collectedTypes[types[i] - 1] == true) {
        continue;
      } else {
        collectedTypes[types[i] - 1] = true;
        count++;
      }
      if (count == 5) {
        answer = i;
        break;
      }
    }
    return answer;
  }
}