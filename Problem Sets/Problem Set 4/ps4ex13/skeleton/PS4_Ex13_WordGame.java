/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #13: PS4_Ex13_WordGame.java
 * 
 * This program reads in a word and computes
 * the total points of all the letters in the word.
 * 
 * Haowei
 */

import java.util.*;

class WordGame {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = sc.nextLine();
    System.out.println("Total score = " + computeScore(word));
  }
  
  // Compute total score of letters in a word
  public static int computeScore(String word) {
    
    // alphabet score array from index 0 to 25
    int[] scoreArr = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    int score = 0;

    for (int i = 0; i < word.length(); i++) {
      score += scoreArr[word.charAt(i) - 65]; // -65 to make all upper-cased letters 0 indexed
    }
    return score;
  }
}