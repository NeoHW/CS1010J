/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #20: PS2_Ex20_UCard.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * Haowei
 */


 // can consider extracting digit by digit and performing all caluclations before moving on to the next one


import java.util.*;

class UCard {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter uCard Number: ");
    int uCardNo = sc.nextInt();

    // Creating an array in reverse
    int numDigit = numberOfDigits(uCardNo);
    int[] array = new int[numDigit];
    for (int i = 0; i < numDigit - 1; i++) {
      array[i] = getLast(uCardNo);
      uCardNo /= 10;
    }
    array[numDigit - 1] = uCardNo;

    // Reverse the array
    for(int i = 0; i < array.length/2; i++){
      int temp;
      temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }

    // Doing this first as array will get mutated later on in luhnah method
    String statement = Branch(array); 

    int checkNo = luhnah(array);
    System.out.println("The check number is " + checkNo);
    
    if(checkNo % 7 == 0){
      System.out.println("Valid");
      System.out.println(statement);
    } else {
      System.out.println("Invalid");
    }
  }
  
  // Obtain int check number from int card number
  public static int luhnah(int[] array) {


    // Doubling effort
    for(int i = array.length - 2; i >= 0; i -= 2) {
      array[i] *= 2;
    }

    // Sum of digits
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      if(array[i] >= 10){
        sum += addDoubleDigit(array[i]);
      } else{
        sum += array[i];
      }
    }
    return sum;
  }
  
  public static int numberOfDigits(int number) {
    int count = 0;
    while( number >= 10) {
      number /= 10;
      count++;
    }
    return ++count; // Note to self: return count++ does NOT work as it returns count before ++ operation
  }

  public static int addDoubleDigit(int number) {
    int sum = 0;
    sum += number % 10;
    return ++sum; // first digit will always be a 1
  }


  public static int getLast(int number) {
    return number % 10;
  }

  // Check first two digits and return a String
  public static String Branch(int[] array) {
    int firstTwoDigits;
    if(array.length <= 1) {
      firstTwoDigits = array[0]; // edge case where uCard number is only one digit
    } else {
      firstTwoDigits = array[0] * 10 + array[1];
    }

    if(firstTwoDigits >= 31 && firstTwoDigits <= 35) {
      return "Issued by East branch";
    } else if(firstTwoDigits >= 51 && firstTwoDigits <= 55) {
      return "Issued by West branch";
    } else {
      return "Issued by Central branch";
    }
  }
}