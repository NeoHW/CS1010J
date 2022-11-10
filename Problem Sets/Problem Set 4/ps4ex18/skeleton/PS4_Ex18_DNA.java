/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #18: PS4_Ex18_DNA.java
 * 
 * This program contains two parts:
 *     Part (a): A method to compute the pair-wise Hamming
 *     distances between N strings.
 *     Part (b): A method to check whether each of the N
 *     strings is a rotation of some other string.
 * 
 * Haowei
 */

import java.util.*;

class DNA {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of DNA strings: ");
    int DNAnums = sc.nextInt();
    sc.nextLine();

    String[] DNAs = new String[DNAnums];

    // Creating DNA array
    for(int i = 0; i < DNAnums; i++) {
      System.out.print("Enter string " + i + ": ");
      DNAs[i] = sc.nextLine();
    }
    
    // Hamming distances Array
    int[] hammingDistancesArr = hammingDistances(DNAs);
    for(int i = 0; i < hammingDistancesArr.length; i++) {
      System.out.println("The Hamming distance of pair " + i + " is: " + hammingDistancesArr[i]);
    }
    

    // For rotation
    boolean[] rotation = isRotation(DNAs);
    for(int i = 0; i < rotation.length; i++) {
      if(rotation[i]) {
        System.out.println("String " + i + " is a rotation of another string");
      } else {
        System.out.println("String " + i + " is not a rotation of any other string");
      }
    }
  }
  
  // Return Hamming distances between all pairs of two strings
  public static int[] hammingDistances(String[] dna) {
    
    int numOfLengths = 0;
    int numOfDNAs = dna.length-1;
    while(numOfDNAs != 0) {
      numOfLengths += numOfDNAs;
      numOfDNAs--;
    }

    int[] distanceArr = new int[numOfLengths];
    int arrayIndex = 0;

    for(int i = 0; i < dna.length; i++) {
      for (int j = i+1; j < dna.length; j++) {
        distanceArr[arrayIndex] = computeDistance(dna[i], dna[j]);
        arrayIndex++;
      }
    }

    return distanceArr;
  }
  
  // Compute Hamming distance between str1 and str2
  public static int computeDistance(String str1, String str2) {
    
    int length = str1.length();
    int count = 0;

    for(int i = 0; i < length; i++) {
      if(str1.charAt(i) != str2.charAt(i)) {
        count++;
      }
    }
    return count;
  }
  
  // Check pair-wise rotations between all strings
  public static boolean[] isRotation(String[] dna) {
    
    boolean[] rotation = new boolean[dna.length];

    for(int i = 0; i < rotation.length; i++) {
      checkRotation(dna, rotation, i);
    }

    return rotation;
  }

  public static void checkRotation(String[] dna, boolean[] rotation, int i) {
    int length = dna[i].length();

    String leftRotation = dna[i];
    String rightRotation = dna[i];

    // For a DNA of x letters, need x-1 rotations to complete all possible combinations
    for(int x = 0; x < length-1; x++) {
      // left rotation
      leftRotation = leftRotation.substring(1) + leftRotation.charAt(0);
      // right rotation
      rightRotation = rightRotation.charAt(length-1) + rightRotation.substring(0,length-1); // NOTE: end index of .substring() is EXLCUSIVE
  
      for(int j = i+1; j < rotation.length; j++) {
        
        if(leftRotation.equals(dna[j]) || rightRotation.equals(dna[j]) || dna[i].equals(dna[j])) { // Base case of equal DNA strings without any rotations must be considered as well
          rotation[i] = true;
          rotation[j] = true;
        }
      }
    }
  }
}