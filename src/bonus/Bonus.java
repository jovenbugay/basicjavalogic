
package bonus;

import java.util.Scanner;

/**
 *
 * @author Joven
 */
public class Bonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int a;
       double average;
       double number =0;
       System.out.println("How many inputs?: ");
       a = input.nextInt();
       int [] numbers = new int[a];
       double sum = 0;
       sum = sum + number;
       System.out.println("Enter the numbers: ");
       for (int index = 0; index < numbers.length; index++){
           
           number = input.nextInt();
           sum = sum + number;
       }
       average = sum/a;
       System.out.println("Average: "+ average);
       if(average >100){
          System.out.println("Great!");
       }
    double  br = average % 10;
    
      if (br == 0){
    System.out.println("True"); 
      }
    else{
       System.out.println("false");
            }
}
    }