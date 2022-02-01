/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sumOdd = 0;	  // The accumulated sum, init to 0
      int sumEven = 0;
	  int count = 0;
	  double averageOdd;	  // average in double
      double averageEven;
	  final int LOWERBOUND = 111;
      final int UPPERBOUND = 8899;
	  int number = LOWERBOUND;
	  
      do {
		 if (number % 2 == 0) {
			sumOdd += number*number;
		 }
		 else {
			 sumEven += number*number;
		 }
         ++number;
		 ++count;
      } while (number <= UPPERBOUND);

      // Compute average in double. Beware that int / int produces int!
      averageOdd = (double)sumOdd / (double)count;
	  averageEven = (double)sumEven / (double)count; 
      // Print sum and average
      System.out.println( "The sum of even numbers squared from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven );
	  System.out.println( "The sum of odd numbers squared from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd );
   }
}