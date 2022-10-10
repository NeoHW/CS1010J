/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #07: PS1_Ex07_Investment.java
 * 
 * This program computes the amount earned given principal amount,
 * interest rate, and number of years, based on compound interest.
 * 
 * Haowei
 */

import java.util.*;
import java.text.*;

// Check with prof why commented methods does not work

class Investment {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter principal amount: ");
    int principal = sc.nextInt();
    
    System.out.print("Enter interest rate   : ");
    int rate = sc.nextInt();
    
    System.out.print("Enter number of years : ");
    int numYears = sc.nextInt();

    double ratePercentage = rate/100.0;
    
    int power = numYears + 1;

    double numerator = principal * (1 - Math.pow(ratePercentage,power));
    
    double denominator = 1 - ratePercentage;

    double totalAmount = numerator/denominator;

    /* 
    double power = (double)Math.pow(ratePercentage,numYears + 1);

    double totalAmount = (principal * (1 - power))/(1.00 - rate/100);

    */

    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Amount = $" + df.format(totalAmount));
  }
}