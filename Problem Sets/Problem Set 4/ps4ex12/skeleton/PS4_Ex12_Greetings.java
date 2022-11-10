/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #12: PS4_Ex12_Greetings.java
 * 
 * This program reads age, name and gender of a person,
 * prints out corresponding greeting message.
 * 
 * Haowei
 */

import java.util.*;

class Greetings {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Your age? ");
    int age = sc.nextInt();
    sc.nextLine(); // to consume nextline character 
    System.out.print("Your name? ");
    String name = sc.nextLine();
    System.out.print("Your gender? ");
    String gender = sc.next();

    if(gender.equals("Male")) {
      System.out.print("Hello ");
    } else {
      System.out.print("Hey " );
    }

    if(age <18) {
      if(gender.equals("Male")) {
        System.out.print("boy " );
      } else {
        System.out.print("girl " );
      }
    } else {
      if(gender.equals("Male")) {
        System.out.print("Mr. " );
      } else {
        System.out.print("Ms. " );
      }
    }
    
    System.out.println(name);
  }
}