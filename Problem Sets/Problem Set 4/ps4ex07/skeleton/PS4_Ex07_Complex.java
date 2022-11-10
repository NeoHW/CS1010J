/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #07: PS4_Ex07_Complex.java
 * 
 * A complex number has the form a + bi where a is the real part and
 * b is the imaginary part.
 * 
 * Haowei
 */

class Complex {
  
  private int real, imag;
  
  public Complex(int inReal, int inImag) {
    this.real = inReal;
    this.imag = inImag;
  }
  
  // this = this + another
  public void add(Complex another) {
    this.real += another.real;
    this.imag += another.imag;
  }
  
  // this = this - another
  public void minus(Complex another) {
    this.real -= another.real;
    this.imag -= another.imag;
  }
  
  // this = this * another
  public void multiple(Complex another) {
    int copyReal = this.real;
    int copyImag = this.imag;
    
    this.real = copyReal*another.real - copyImag*another.imag;
    this.imag = copyImag*another.real + copyReal*another.imag;
  }
  
  // this = this / another
  public void divide(Complex another) {
    int copyReal = this.real;
    int copyImag = this.imag;
    this.real = (copyReal*another.real + copyImag*another.imag) / (another.real*another.real + another.imag*another.imag);
    this.imag = (copyImag*another.real - copyReal*another.imag) / (another.real*another.real + another.imag*another.imag);
  }
  
  // Return "(real + imag'i')"
  public String toString() {
    return "(" + this.real + " + " + this.imag + "i)";  
  }
}