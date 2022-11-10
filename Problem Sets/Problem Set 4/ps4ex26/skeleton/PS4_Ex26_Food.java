/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #26: PS4_Ex26_Food.java
 * 
 * This program computes the number of ways to have 
 * fast-food meals and health-food meals out of n meals.
 * 
 * Haowei
 */

import java.util.*;

class Food {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter total number of meals: ");
    int meals = sc.nextInt();
    
    System.out.println("Number of combinations = " + enumerate(meals));

  }
  
  // Compute the number of ways to take the n meals
  // provided there are NO two consecutive fast-food meals.
  public static int enumerate(int n) {
    
    if (n == 1) {  // 1 meal, 2 choices
      return 2;
    } else if (n == 2) {  // 2 meals, 3 choices
      return 3;
    } else {
      // if this meal is health-food meal, next one can be either health or fast-food meal.
      // Therefore the number of choices is enumerate(n-1).
      // if this meal is fast-food meal, next meal must be health-food meal,
      // the number of choices is enumerate(n-2)
      return enumerate(n-1) + enumerate(n-2);
    }
  }



  // Compute the number of ways to take the n meals
  // provided there are NO two consecutive fast-food meals.
  /** 
  public static int enumerate(int n, int ff) {
    
    // ff = 0 means previous meal is healthy, ff = 1 means previous meal is fast food

    if(n == 1) {
      return 2;
    } else if (n == 2 && ff == 0) { // FH,HF,HH
      return 3;
    } else if (n == 2 && ff == 1) { // HH,HF
      return 2;
    } else {
      // case where healthy food first + case where fast food first
      if(ff == 1) {
        return enumerate(n-1, 0);
      } else {
        return enumerate(n-1, 0) + enumerate(n-1, 1);
      }
    }
  }
  */
}