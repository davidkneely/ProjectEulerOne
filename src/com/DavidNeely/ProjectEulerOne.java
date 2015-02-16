package com.DavidNeely;

/**
 * Created by davidneely on 2/15/15.
 */
public class ProjectEulerOne {
  public static void main(String[] args) {

    int sum;
    int input = 1000;
    sum = computeSumOfMulitples(input);

    System.out.println("The sum of all numbers is: " + sum);

  }

  public static int computeSumOfMulitples(int inputNumber) {
    int sum = 0;
    for (int i = 0; i < inputNumber; i++){

      if(i % 3 == 0){
        // add to list
        sum += i;
      }
      else if (i % 5 == 0){
        sum += i;
      }
    }
    return sum;
  }
}
