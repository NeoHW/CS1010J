/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #24: PS1_Ex24_TimeDifference.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.Scanner;
import java.text.*;

class TimeDifference {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int hour1 = sc.nextInt();
    int minute1 = sc.nextInt();
    int second1 = sc.nextInt();
    
    int hour2 = sc.nextInt();
    int minute2 = sc.nextInt();
    int second2 = sc.nextInt();

    int hourDiffernce;
    int minuteDifference;
    int secondDifference;


    if((second2 - second1) < 0) {
      secondDifference = second2 + 60 - second1;
      minute2--;
    } else {
      secondDifference = second2 - second1;
    }

    if((minute2 - minute1) < 0) {
      minuteDifference = minute2 + 60 - minute1;
      hour2--;
    } else {
      minuteDifference = minute2 - minute1;
    }

    hourDiffernce = hour2 - hour1;

    
    // To show output as two digits with possible leading zero.
    // For example, df.format(8) will show 8 as 08
    DecimalFormat df = new DecimalFormat("00");
    
    System.out.println("Time difference: " + df.format(hourDiffernce) +  ":" + df.format(minuteDifference) +  ":" + df.format(secondDifference));
  }
}