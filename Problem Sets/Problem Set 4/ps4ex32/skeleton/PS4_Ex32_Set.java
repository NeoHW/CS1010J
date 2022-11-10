/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #32: PS4_Ex32_Set.java
 * 
 * A Set has two attributes: an array used to store value and a 'size'
 * that indicates the number of data in the Set.
 * 
 * Haowei
 */

import java.util.*;

class Set {
  
  private int size;     // the number of data in a set
  private int[] values; // a collection of data
  
  public Set(int num) {
    values = new int[num];
    // size should be zero because array is created
    // but data is not populated!
    this.size = 0;
  }
  
  // Add data to the back (first empty slot) of the set
  public void add(int data) {
    this.values[this.size] = data;
    this.size++;
  }
  
  // Return true if data exists in the set, or false otherwise
  public boolean contains(int data) {
    
    for(int i = 0; i < this.size; i++) {
      if(this.values[i] == data) {
        return true;
      }
    }
    return false;
  }
  
  // Return the number of integers in this set 
  public int getSize() {
    return this.size;
  }
  
  // Check if this set is a subset of another set
  public boolean isSubsetOf(Set another) {
    
    for(int i = 0; i < this.size; i++) {
      if(!another.contains(this.values[i])) {
        return false;
      }
    }
    return true;
  }
  
  // Check if 'this' set has the same content as 'another' set
  public boolean equals(Set another) {
    
    if(this.size != another.size) {
      return false;
    }
    return this.isSubsetOf(another);
  }
  
  // Return string representation of values in the Set.
  // Format: e.g. "[1, 2, 3]"
  public String toString() {
    
    return Arrays.toString(this.values);

    /**
    String s = "[";
    for(int i = 0; i < this.size - 1; i++) {
      s = s + this.values[i] + ", ";
    }
    s = s + this.values[this.size -1] + "]";
    return s;
    */
  }
}