/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #11: PS4_Ex11_ICCheckCode.java
 * 
 * This program reads a NRIC number and produces its check code.
 * 
 * Haowei
 */

import java.util.*;

class ICCheckCode {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter prefix of NRIC: ");
    String prefix = sc.nextLine();
    System.out.print("Enter 7-digit of NRIC number: ");
    int nums = sc.nextInt();
    char checkCode = generateCode(nums,prefix);
    System.out.println("Check code is " + checkCode);
  }
  
  // Generate check code according to the given algorithm
  public static char generateCode(int num, String prefix) {
    
    int sum = 0;
    int[] numArr = new int[7];
    for(int i = 6; i >=0 ; i--) {
      numArr[i] = num%10;
      num/=10;
    }


    int[] weightArr = {2,7,6,5,4,3,2};
    for(int i = 0; i < 7; i++) {
      numArr[i] *= weightArr[i];
      sum += numArr[i];
    }
    if(prefix.equals("T")) {
      sum += 4;
    }
    sum = sum%11;

    char[] charArr = {'J', 'Z', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
    return charArr[sum];
  }
}