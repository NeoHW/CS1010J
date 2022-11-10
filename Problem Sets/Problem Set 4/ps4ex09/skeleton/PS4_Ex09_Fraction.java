/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #09: PS4_Ex09_Fraction.java
 * 
 * A class to describe Fraction. A fraction has two attributes:
 * numerator and denominator.
 * 
 * Haowei
 */

class Fraction {
  
  // Attributes
  private int numer, denom;
  
  // Constructor
  public Fraction(int numerator, int denominator) {
    this.numer = numerator;
    this.denom = denominator;
  }
  
  // Private helper method to calculate
  // and return greatest common divisor
  private int euclidGcd(int a, int b) {
    
    int remainder;
    while (b > 0) {
      remainder = a % b;
      a = b;
      b = remainder;
    }   
    return a; 
  }
  
  // Return a new Fraction object that is simplified from 'this' object
  // 'this' (the calling) fraction object should not be modified.
  private Fraction simplify() {

    int gcd = euclidGcd(Math.abs(numer), Math.abs(denom)); // Math.abs() to account for if numer/denom is negative
    Fraction result = new Fraction(this.numer/gcd, this.denom/gcd); 
    // change negative denom to positive
    if(result.denom < 0) {
      result.denom *= -1;
      result.numer *= -1;
    }
    return result;
  }
  
  // Add this Fraction object with another and return
  // the sum as a new Fraction object in simplified form
  public Fraction add(Fraction another) {

    if(this.denom == another.denom) {
      Fraction result = new Fraction(this.numer + another.numer, this.denom);
      return result.simplify();
    } else {
      Fraction result = new Fraction(this.numer*another.denom + another.numer*this.denom, this.denom*another.denom);
      return result.simplify();
    }
  }
  
  // Return 'this' - 'another' as a new Fraction object
  public Fraction minus(Fraction another) {
    
    if(this.numer == 0) {
      Fraction result = new Fraction(-another.numer, another.denom);
      return result.simplify();
    } else if (another.numer == 0) {
      return this.simplify();
    } else {
      Fraction result = new Fraction(this.numer*another.denom - another.numer*this.denom, this.denom*another.denom);
      return result.simplify();
    }
  }
  
  // Return 'this' * 'another' as a new Fraction object
  public Fraction times(Fraction another) {
    
    Fraction result = new Fraction(this.numer * another.numer, this.denom*another.denom);
    return result.simplify();
  }
  
  // Return 'this' / 'another' as a new Fraction object
  public Fraction divide(Fraction another) {
    
    Fraction recipocal = new Fraction(another.denom, another.numer);
    return (this.times(recipocal));
  }
  
  // return "numerator/denominator"
  public String toString() {
    return this.numer + "/" + this.denom;
  }
  
  // Check if this object equals another
  public boolean equals(Fraction another) {
    Fraction simplifiedOne = this.simplify();
    Fraction simplifiedTwo = another.simplify();
    return (simplifiedOne.numer == simplifiedTwo.numer && simplifiedOne.denom == simplifiedTwo.denom);
  }
  
  // Check if this object is larger than another
  public boolean largerThan(Fraction another) {
    return (this.numer*another.denom > another.numer*this.denom);
  }
}