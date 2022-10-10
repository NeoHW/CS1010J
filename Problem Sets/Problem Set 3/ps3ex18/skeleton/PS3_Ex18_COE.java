/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #18: PS3_Ex18_COE.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class COE {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of available COEs: ");
    int limit = sc.nextInt();
    System.out.print("Enter the number of bids: ");
    int size = sc.nextInt();
    System.out.print("Enter " + size + " bids: ");
    int[] bids = new int[size];

    for(int i = 0; i < size; i++) {
      bids[i] = sc.nextInt();
    }
    
    sortBids(bids);

    int finalPrice;
    if(limit > size){
      finalPrice = bids[size -1];
    } else {
      int limitIndex = limit - 1;
      finalPrice = bids[limitIndex];

      // Find next highest bid if finalPrice has another bid of same price not included in top limit
      if(bids[limitIndex] == bids[limitIndex + 1]){
        for(int i = limitIndex-1; i >= 0; i--){
          if(bids[limitIndex] != bids[i]) {
            finalPrice = bids[i];
            break;
          }
        }
      }
    }
    
    System.out.println("COE final price this month is $" + finalPrice);
  }
  
  // Sort bids in descending order
  public static void sortBids(int[] bids) {
    int temp;
    boolean swapped;
    for(int i = 0; i < bids.length; i++) {
      swapped = false;
      for(int j = bids.length-1; j > i; j--){
        if(bids[j] > bids[j-1]) {
          temp = bids[j];
          bids[j] = bids[j-1];
          bids[j-1] = temp;
          swapped = true;
        }
      }
      if(swapped == false) {
        break;
      }
    }
  }
}