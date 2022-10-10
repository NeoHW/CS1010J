/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #27: PS3_Ex27_Contour.java
 * 
 * <Fill in a short description of this program>
 * 
 * Haowei
 */

import java.util.*;

class Contour {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and cols: ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    
    int[][] map = new int[row][col];
    
    System.out.println("Enter the data:");
    scanArray(map, sc);
    
    int[][] peaksandvalleys = new int[row][col];
    int[] countPeakValley = new int[2];
    
    getPeaksValleys(map, peaksandvalleys, countPeakValley);

    System.out.println("Number of peaks = " + countPeakValley[0]);
    System.out.println("Number of valleys = " + countPeakValley[1]);
    System.out.println("Peaks and Valleys map");
    printArray(peaksandvalleys);
    
    int[][] hike = new int[row][col];
    
    getHikeTrail(map, hike);

    System.out.println("Hiking map");
    printArray(hike);
  }
  
  // from Map matrix, count number of Peaks & Valleys and store it in countPeakValley array, and produce peaksandvalleys map in new matrix
  public static void getPeaksValleys(int[][] map, int[][] peaksandvalleys, int[] countPeakValley) {
    int numRows = map.length, numCols = map[0].length;
    int countPeak = 0;
    int countValley = 0;

    // Do not have to check border numbers as they has <8 neighbours
    for(int i = 1; i < numRows-1; i++){
      for(int j = 1; j < numCols-1; j++) {
        if(isPeak(map, i,j)) {
          countPeak++;
          peaksandvalleys[i][j] = 1;
        }
        else if(isValley(map, i,j)) {
          countValley++;
          peaksandvalleys[i][j] = 2;
        }
      }
    }
    countPeakValley[0] = countPeak;
    countPeakValley[1] = countValley;
  }
  
  public static boolean isPeak(int[][] map, int i, int j) {
    int center = map[i][j];

    // for rows above and below
    for(int y = i-1; y <= i+1; y++) {
      // for columns beside
      for(int x = j-1; x <= j+1; x++) {
        // skipping own middle number
        if(y == i && x == j) {
          continue;
        }
        if(map[y][x] >= center) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean isValley(int[][] map, int i, int j) {
    int center = map[i][j];

    // for rows above and below
    for(int y = i-1; y <= i+1; y++) {
      // for columns beside
      for(int x = j-1; x <= j+1; x++) {
        // skipping own middle number
        if(y == i && x == j) {
          continue;
        }
        if(map[y][x] <= center) {
          return false;
        }
      }
    }
    return true;
  }


  // Create a hiking Trail, can only travel NSEW where elevations differ by 2
  public static void getHikeTrail(int[][] map, int[][] hike) {
    // set starting point at top left corner
    hike[0][0] = 1;
    int numRows = map.length, numCols = map[0].length;
    // check starting point
    checkTraversable(map, hike, 0, 0);
    
    // this nested loop checks once up to down
    for(int i = 0; i < numRows; i++) {
      for(int j = 0; j < numCols; j++) {
        // checking traversals
        // right
        if(j != numCols-1 && hike[i][j+1] == 1) {
          checkTraversable(map, hike, i, j+1);
        }
        // down
        if(i != numRows-1 && hike[i+1][j] == 1) {
          checkTraversable(map, hike, i+1, j);
        }
        // left
        if(j != 0 && hike[i][j-1] == 1) {
          checkTraversable(map, hike, i, j-1);
        } 
        // up
        if(i != 0 && hike[i-1][j] == 1) {
          checkTraversable(map, hike, i-1, j);
        }
      }
    }

    // 2nd nested loop to check bottom up 
    for(int i = numRows-1; i >=0 ; i--) {
      for(int j = 0; j < numCols; j++) {
        // checking traversals
        // right
        if(j != numCols-1 && hike[i][j+1] == 1) {
          checkTraversable(map, hike, i, j+1);
        }
        // down
        if(i != numRows-1 && hike[i+1][j] == 1) {
          checkTraversable(map, hike, i+1, j);
        }
        // left
        if(j != 0 && hike[i][j-1] == 1) {
          checkTraversable(map, hike, i, j-1);
        } 
        // up
        if(i != 0 && hike[i-1][j] == 1) {
          checkTraversable(map, hike, i-1, j);
        }
      }
    }
  }

  public static void checkTraversable(int[][] map, int[][] hike, int i , int j) {
    int center = map[i][j];
    int numRows = map.length, numCols = map[0].length;

    // check right
    if(j != numCols-1 && hike[i][j+1] == 0) {
      if(Math.abs(center - map[i][j+1]) <= 2) {
        hike[i][j+1] = 1;
      }
    }

    // check down
    if(i != numRows-1 && hike[i+1][j] == 0) {
      if(Math.abs(center - map[i+1][j]) <= 2) {
        hike[i+1][j] = 1;
      }
    }
    // check left
    if(j != 0 && hike[i][j-1] == 0) {
      if(Math.abs(center - map[i][j-1]) <= 2) {
        hike[i][j-1] = 1;
      }
    }
    // check up
    if(i != 0 && hike[i-1][j] == 0) {
      if(Math.abs(center - map[i-1][j]) <= 2) {
        hike[i-1][j] = 1;
      }
    }
  }
  
  
  // Provided method; don't modify it
  // Read in the data for the contour map
  public static void scanArray(int[][] array, Scanner sc) {
    int numRows = array.length, numCols = array[0].length;
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        array[row][col] = sc.nextInt();
      }
    }
  }
  
  // Provided method; don't modify it
  // Print the 2D map
  public static void printArray(int[][] array) {
    int numRows = array.length, numCols = array[0].length;
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        System.out.print(array[row][col] + " ");
      }
      System.out.println();
    }
  }
}