// W.A.J.P to find factorial for Given Number.

package assignmentt2;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("The factorial of " + num + " is: " + factorial);
	}

}
