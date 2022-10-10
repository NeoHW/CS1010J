/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #11: PS1_Ex11_Root.java
 * 
 * <Fill in a short description of this program>
 * 
 * Haowei
 */


import java.util.Scanner;
import java.text.DecimalFormat;

class Root {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter coefficients (a b c): ");

    double a = sc.nextInt();
    double b = sc.nextInt();
    double c = sc.nextInt();

    DecimalFormat df = new DecimalFormat("0.00");

    System.out.println("Bigger root is " + df.format(getRoot(a, b, c)));
    
  }
  
  // Take the three coefficients and return the bigger root
  public static double getRoot(double a, double b, double c) {
    

    double plusRoot = (-b + Math.sqrt(b*b - 4 * a * c))/(2*a);
    double minusRoot = (-b - Math.sqrt(b*b - 4 * a * c))/(2*a);

    return (plusRoot > minusRoot) ? plusRoot : minusRoot;
  }
}