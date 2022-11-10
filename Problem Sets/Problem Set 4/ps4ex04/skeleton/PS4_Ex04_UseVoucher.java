/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #04: PS4_Ex04_UseVoucher.java
 * 
 * This program helps Mr. Tan to use a couple of vouchers
 * wisely together with cash such that there is no overpay anytime.
 * 
 * Haowei
 */

import java.util.*;

class UseVoucher {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter voucher name: ");
    String name = sc.nextLine();
    
    System.out.print("Enter voucher face value: $");
    int value = sc.nextInt();
    
    System.out.print("Enter the number of vouchers: ");
    int voucherAmt = sc.nextInt();
    
    // create a Voucher object with 3 values read
    Voucher voucher = new Voucher(name,value,voucherAmt);
    
    System.out.print("Enter the price to pay: $");
    int price = sc.nextInt();    
    
    int vouchersUsed = voucher.useVoucher(price);

    System.out.println("Use " + vouchersUsed + " " + voucher.getName() +  " voucher(s)");
    System.out.println("Cash payment: $" + (price - vouchersUsed*value));
    System.out.println("There remains " + voucher.getAmt() + " voucher(s)");
  }
}