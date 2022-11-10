/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #17: PS4_Ex17_CountWords.java
 * 
 * This program reads a sentence and
 * counts the number of words in it.
 * 
 * Haowei
 */

import java.util.*;

class CountWords {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();

    System.out.println("Word count = " + wordCount(sentence));
  }
  
  // Count the number of words in sentence
  public static int wordCount(String sentence) {
    
    int count = 0;
    String[] arr = sentence.split(" ");
    for(int i = 0 ; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length(); j ++) {
        if(Character.isLetter(arr[i].charAt(j))) {
          count++;
          break;
        }
      }
    }
    return count;
  }
}