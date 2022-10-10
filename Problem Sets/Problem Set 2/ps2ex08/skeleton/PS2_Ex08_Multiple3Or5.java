/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #08: PS2_Ex08_Multiple3Or5.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Multiple3Or5 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    int num = sc.nextInt();

    int count = 0;
    for(int i = 3; i < num; i++){
      if(i % 3 == 0 || i % 5 == 0) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}