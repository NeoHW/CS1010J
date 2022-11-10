/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #15: PS4_Ex15_PigLatin.java
 * 
 * This program reads in a sentence comprising words,
 * and converts the it into Pig Latin.
 * Pig Latin is a language game primarily used in English.
 * It is usually used by children, who often use it to
 * converse in (perceived) privacy from adults,
 * or simply for amusement. (From Wikipedia)
 * 
 * Haowei
 */

import java.util.*;

class PigLatin {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();
    String[] wordArr = sentence.split(" ");
    
    String converted = "";
    for (int i = 0; i < wordArr.length; i++) {
      converted = converted +  convert(wordArr[i]);
      if(i != wordArr.length-1) {
        converted = converted + " ";
      }
    }
    
    System.out.println("Converted: " + converted);
  }
  
  // Convert a single word.
  // For a word starting with a consonant, move that first consonant
  // to the end of the word and append "ay".
  // For a word starting with a vowel, simply append "way" to the word.
  // Return the converted word.
  public static String convert(String word) {
    
    char firstLetter = word.charAt(0);
    String newWord = "";
    switch(firstLetter) {
      case 'a' :
      case 'e' :
      case 'i' :
      case 'o' :
      case 'u' :
        newWord = word + "way";
        break;
      default: 
        newWord = word.substring(1) + firstLetter + "ay";
    }
    return newWord;
  }
}