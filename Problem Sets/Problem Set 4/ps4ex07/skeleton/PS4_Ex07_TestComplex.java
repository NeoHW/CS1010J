/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #07: PS4_Ex07_TestComplex.java
 * 
 * This program does addition, minus, multiplication and division
 * on two complex numbers.
 * 
 * Haowei
 */

import java.util.*;

class TestComplex {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // read and create the first complex number
    int real = sc.nextInt();
    int imag = sc.nextInt();
    sc.nextLine(); // !! to consume new line character
    Complex num = new Complex(real, imag);
    System.out.println("Complex number " + num + " created");
    
    // read commands, each followed by a complex number
    // stop when "q" is read
    while(true) {
      
      String input = sc.nextLine();
      if(input.equals("q")) {
        break;
      }
      String[] parts = input.split(" ");
      int newReal = Integer.valueOf(parts[1]);
      int newImag = Integer.valueOf(parts[2]);
      Complex newNum = new Complex(newReal, newImag);
      switch(parts[0]) {
        case "+":
          num.add(newNum);
          System.out.println("After addition: " + num);
          break;
        case "-":
          num.minus(newNum);
          System.out.println("After subtraction: " + num);
          break;
        case "*":
          num.multiple(newNum);
          System.out.println("After multiplication: " + num);
          break;
        case "/":
          num.divide(newNum);
          System.out.println("After division: " + num);
          break;
      }
    }
  }
}