package assignmentt2;
// WAP to compute the sum of the first 100 prime numbers.

public class Prime_No_100 {
public static void main(String[] args) {
	 int count = 0;
     long sum = 0;

     
     for (int number = 2; count < 100; number++) {
         boolean isPrime = true;

         
         for (int i = 2; i <= number / 2; i++) {
             if (number % i == 0) {
                 isPrime = false;
                 break;
             }
         }

         
         if (isPrime) {
             sum += number;
             count++;
         }
     }

     System.out.println("Sum of the first 100 prime numbers is: " + sum);
			
			
}
}
