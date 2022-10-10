/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #22: PS1_Ex22_Younger.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.Scanner;

class Younger {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter birthday for Tamil (day month year): ");
    int yearT = sc.nextInt();
    int monthT = sc.nextInt();
    int dayT = sc.nextInt();
    
    System.out.print("Enter birthday for Alice (day month year): ");
    int yearA = sc.nextInt();
    int monthA = sc.nextInt();
    int dayA = sc.nextInt();
    
    if (yearT == yearA && monthT == monthA && dayT == dayA) {
      System.out.println("Tamil and Alice are of the same age");
    } else if (yearA > yearT || (yearA == yearT && monthA > monthT) || (yearA == yearT && monthA == monthT && dayA > dayT)) {
      System.out.println("Alice is younger");
    } else {
      System.out.println("Tamil is younger");
    }
  }
}