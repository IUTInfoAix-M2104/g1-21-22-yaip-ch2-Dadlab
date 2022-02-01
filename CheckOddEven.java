/**
 * Trying if-else statement and modulus (%) operator.
 */
public class CheckOddEven {   // Save as "CheckOddEven.java"
   public static void main(String[] args) {  // Program entry point
      int number = -2;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if ( number % 2 == 0 ) {
         System.out.println( number + " is even." );   // even number
      } else {
         System.out.println( number + " is odd." );   // odd number
      }
      System.out.println( "DONE" );
   }
}