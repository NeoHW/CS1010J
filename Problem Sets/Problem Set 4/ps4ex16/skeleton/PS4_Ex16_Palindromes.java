/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #16: PS4_Ex16_Palindromes.java
 * 
 * This program reads a list of input strings, reports
 * how many of them are palindrome if we disregard case
 * and all non-letter characters.
 * 
 * Haowei
 */

import java.util.*;

class Palindromes {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int count = 0;

    System.out.print("How many strings? ");
    int num = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Enter " + num + " strings, each on a line:");
    for(int i = 0; i < num; i++) {
      String line = sc.nextLine();
      if(isPalindrome(line)) {
        count++;
      }
    }
    
    System.out.println("Number of palindromes = " + count);
  }
  
  
  // Check a single string 'str'.
  // Return true if str is a palindrome, or false otherwise.
  public static boolean isPalindrome(String str) {
    String newString = "";

    // creating new string, no whitespaces or punctuation, all lowercase
    str = str.toLowerCase().trim();
    for (int i = 0; i < str.length(); i++) {
      if(Character.isLetter(str.charAt(i))) {
        newString = newString + str.charAt(i);
      }
    }
    
    // Checking for palindrome
    for(int i = 0; i < newString.length(); i++) {
      int pointerOne = i;
      int pointerTwo = newString.length() -1 -i;
      if(pointerOne == pointerTwo || pointerOne > pointerTwo) {
        break;
      }
      if(newString.charAt(pointerOne) != (newString.charAt(pointerTwo))) {
        return false;
      }
    }

    return true;
  }
}