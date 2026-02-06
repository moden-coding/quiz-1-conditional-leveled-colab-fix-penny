import java.util.*;

/**
 *  Task: Write code that will take input and output different messages. 
 *  
 *  Description: Our code should take in inputs then print a message based on divisibility tests.
 * 
 *  Basic task (up to B+ level): Take input from the user. Output if the number is even or odd.
 *  
 *  Moderate task (up to A level): Do all of the above AND check to see if the number is divisible 
 *  by 3 and/or 5:
 *  If the number is divisible by 3 but not 5, print "The number is divisible by 3."
 *  If the number is divisible by 5 but not 3, print "The number is divisible by 5."
 *  If divisible by both 3 and 5, print "The number is divisible by both 3 and 5."
 *  If the number is not divisible by 3 or 5, print "The number is not divisible by 3 or 5"
 * 
 *  Challenge task (up to A+ level): Complete both of the above AND check to see if the number 
 *  is greater than 0 and less than 100. If the number is less than 0 or above 100, say "Wrong number!".
 *  If the number is between 0 and 100, check to see if it is a prime number. A prime number less than
 *  100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 * 
 *  EXAMPLE USAGE:
 *  With input of 3:
 *      Basic:
 *      "The number was odd"
 * 
 *      Moderate:
 *      "The number was odd"
 *      "The number was divisible by 3"
 *  
 *      Challenge:
 *      "The number was odd"
 *      "The number was divisble by 3"
 *      "The number was prime"
 * 
 *  With input of 15:
 *      Basic:
 *      "The number was odd"
 * 
 *      Moderate:
 *      "The number was odd"
 *      "The number was divisible by 3 and 5"
 *  
 *      Challenge:
 *      "The number was odd"
 *      "The number was divisible by 3"
 *      "The number was not prime"
 * 
 *  With input 101:
 *      Basic:
 *      "The number was odd"
 * 
 *      Moderate:
 *      "The number was odd"
 *      "The number is not divisible by 3 or 5"
 *  
 *      Challenge:
 *      "The number was odd"
 *      "The number is not divisible by 3 or 5"
 *      "Wrong number!"
 *  
 */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int divide = (number%2);
        int five = (number%5);
        int three = (number%3);
        int seven = (number%7);
        if (divide == 0){
            System.out.println("The number was even");
        } else if (divide == 1){
            System.out.println("The number was odd");
        } if (three == 0 && five == 0){
            System.out.println("The number is divisible by both 3 and 5");
        } else if (three == 0){
            System.out.println("The number is divisible by 3");
        } else if (five == 0){
            System.out.println("The number is divisible by 5");

        } else{
            System.out.println("The number is not divisible by 3 or 5");
        } if (number < 0 || number > 100){
            System.out.println("Wrong number!");
        } else if (number == 1){
            System.out.println("The number is not prime");
        
        }else if (number == 3 || number == 5 || number == 7) {
            System.out.println("The number is prime");
        }else if (divide > 0 && five > 0 && three > 0 && seven > 0){
            System.out.println("The number is prime");
        } else{
            System.out.println("The number is not prime");
        }




        //Complete moderate task below:




        //Complete challenge task below:


        
    }
}
