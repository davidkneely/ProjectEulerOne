
/**
 * Created by davidneely on 2/2/15.
 */
public class ProjectEulerOne {
  /**
   *     Multiples of 3 and 5
   List all the natural numbers below 10 that are multiples of 3 or 5
   We get 3, 5, 6 and 9.
   The sum of these multiples is 23.
   Find the sum of all the multiples of 3 or 5 below 1000.
   */
  public static void main(String[] args) {
//    System.out.println("Hello World!");

    // create return array
//    ArrayList<String> returnArray = new ArrayList<String>();

    int sum = 0;
    int targetNumber = 1000;
    int returnArray[] = new int[targetNumber];

    for (int i = 0; i < targetNumber; i++){

      if(i % 3 == 0){
        // add to list
        sum += i;
      }
      else if (i % 5 == 0){
        sum += i;
      }
    }

    System.out.println("The sum of all numbers is: " + sum);


  }
}
