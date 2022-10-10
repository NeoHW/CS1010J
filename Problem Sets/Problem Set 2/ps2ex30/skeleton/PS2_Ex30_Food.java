/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #30: PS2_Ex30_Food.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */

import java.util.*;

class Food {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter budget: $");
    int budget = sc.nextInt();
    
    System.out.print("Enter fast-food cost per meal: $");
    int ffCost = sc.nextInt();
    
    System.out.print("Enter health-food cost per meal: $");
    int hfCost = sc.nextInt();

    spend(budget, ffCost, hfCost);
  }

  public static void spend(int budget, int ffCost, int hfCost) {
    
    // max number of starting health food
    int hfCount = budget/hfCost;
    int totalExpense = hfCount * hfCost;
    // max number of starting fast food so TE < budget
    int ffCount = (budget - totalExpense) / ffCost;
    totalExpense += ffCost * ffCount;

    int tempExpense = 0;
    int tempHfCount = hfCount;
    int tempFfCount = ffCount;

    while(tempHfCount >= 0) {
      tempHfCount--;
      tempExpense = tempHfCount * hfCost;
      tempFfCount = (budget - tempExpense) / ffCost;
      tempExpense += tempFfCount*ffCost;
      if (tempExpense > totalExpense) {
        totalExpense = tempExpense;
        hfCount = tempHfCount;
        ffCount = tempFfCount;
      }
      if(totalExpense == budget) {
        break;
      }
    }
    

    System.out.println("Number of fast-food meals = " + ffCount);
    System.out.println("Number of health-food meals = " + hfCount);
  }

}
