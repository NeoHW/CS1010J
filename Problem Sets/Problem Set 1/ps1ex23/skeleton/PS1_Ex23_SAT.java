/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #23: PS1_Ex23_SAT.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class SAT {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter scores: ");
    
    int verbal = sc.nextInt();
    int maths = sc.nextInt();
    int writing = sc.nextInt();

    DecimalFormat df = new DecimalFormat("0.00");
    
    System.out.println("The SAT score is in the " + computePercentile(verbal, maths, writing) + " percentile.");
    
    System.out.println("The IQ score is " + df.format(computeIQScore(verbal, maths)));
    
    if((maths > 600 && verbal > 600 && writing > 600) || computeIQScore(verbal, maths) >= 120) {
      System.out.println("Wow, this is amazing!");
    }
  }
  
  // <Write a short description of the method here>
  public static int computePercentile(int verbal, int maths, int writing) {
    
    int score = verbal + maths + writing;
    if (score < 1500) {
      return 10;
    } else if (score < 2000) {
      return 50;
    } else if (score < 2200) {
      return 95;
    } else {
      return 99;
    }
  }
  
  // <Write a short description of the method here>
  public static double computeIQScore(int verbal, int maths) {
    
    return (0.095 * maths) + (0.003 * verbal) + 50.241;
  }
}