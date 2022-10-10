/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #28: PS3_Ex28_Friendship.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Friendship {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Read in the number of users: ");
    int length = sc.nextInt();
    int[][] mtx = new int[length][length];

    System.out.println("There are " + length + " users, indexed from 0 to " + (length - 1)+ ".");
    System.out.print("Enter the number of pairs of direct friends: ");
    int pairs = sc.nextInt();
    
    System.out.println("Enter " + pairs + " pairs of direct friends:");
    createMatrix(mtx, pairs, sc);
    System.out.println("The friendship matrix is:");
    printMatrix(mtx);

    iSolitude(mtx);
    uFriend(mtx);
  }

  public static void createMatrix(int[][] mtx, int pairs, Scanner sc) {
    
    for(int countPairs = 0; countPairs < pairs; countPairs++) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      mtx[i][i] = 1;
      mtx[j][j] = 1;
      mtx[i][j] = 1;
      mtx[j][i] = 1;
    }
  }

  public static void printMatrix(int[][] mtx) {
    int length = mtx.length;
    for(int i = 0; i < length; i++) {
      for(int j = 0; j < length; j++) {
        System.out.print(" " + mtx[i][j]);
      }
      System.out.println();
    }
  }

  public static void iSolitude(int[][] mtx) {
    int length = mtx.length;
    int[] arr = new int[length];

    // populate array with number of friends for each person
    for(int i = 0; i < length; i++){
      int count = 0;
      for(int j = 0; j < length ; j++) {
        if(mtx[i][j] == 1) {
          count++;
        }
      }
      arr[i] = count;
    }

    // Loop through array to find out what is the least number of friends
    int leastFriends = length;
    for(int i = 0; i < length; i++) {
      if(arr[i] < leastFriends) {
        leastFriends = arr[i];
      }
    }
    System.out.println("The least number of friends found is " + leastFriends);

    // Printing out users with least friends
    for(int i = 0; i < length; i++) {
      if(arr[i] == leastFriends) {
        System.out.println("User " + i + " has least number of friends");
      }
    }
  }
  
  public static void uFriend(int[][] mtx) {
    int length = mtx.length;
    for(int i = 0; i < length; i++) {
      for(int j = 0; j < length; j++) {
        if(i == j) {
          continue;
        }
        if(mtx[i][j] == 0) {
          checkMutual(mtx, i ,j, length);
        }
      }
    }
  }

  public static void checkMutual(int[][] mtx, int person, int comparee, int length) {
    for (int x = 0; x < length; x++) {
      if(mtx[person][x] == 1 && mtx[comparee][x] == 1) {
        System.out.println("Users (" + person + ", " + comparee + ") have a friend-of-friend relation.");
        // Change matrix index to 2 to prevent same comparison e.g. users(0,3) and (3,0) once they have mutuals 
        mtx[comparee][person] = 2;
        break; // So that for >1 mutual friends it will not print twice
      }
    }
  }
}