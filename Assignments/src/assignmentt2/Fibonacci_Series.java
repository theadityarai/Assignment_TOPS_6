// W.A.J.P for create Fibonacci Series.

package assignmentt2;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        
        int first = 0;
        int second = 1;

        
        System.out.print("Fibonacci Series: " + first + ", " + second);

        
        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            //   1			1	+	1
            System.out.print(", " + nextTerm);

            
            first = second;
            second = nextTerm;
        }
        
    }
}
