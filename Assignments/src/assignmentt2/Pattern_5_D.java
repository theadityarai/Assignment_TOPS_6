package assignmentt2;
/* 
    *
   ***
  *****
   ***
    *
 */
public class Pattern_5_D {
	public static void main(String[] args) {
		
	 int count = 0; // Counter for prime numbers found
	    int sum = 0; // Sum of prime numbers
	    int number = 2; // Starting number to check for primes

	    while (count < 100) { // Loop until we find the first 100 prime numbers
	        boolean isPrime = true; // Assume number is prime initially

	        // Check if the number is prime
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                isPrime = false; // Not a prime number
	                break; // Exit the loop early
	            }
	        }

	        // If the number is prime, add it to the sum and increment the count
	        if (isPrime) {
	            sum += number;
	            count++;
	        }

	        number++; // Move to the next number
	    }

	    System.out.println("Sum of the first 100 prime numbers is: " + sum);
	}
}

