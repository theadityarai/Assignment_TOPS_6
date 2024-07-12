//W.A.J.P to Take three numbers from the user and print the greatest number.
package assignmentt2;

import java.util.Scanner;

public class Greatest_of_three {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		
		if(a>b && a>c) {
		System.out.println("A is Greater");
		}
		
		else if(b>c && b>c) {
		System.out.println("B is Greater");
		}
		
		else {
		System.out.println("C is Greater");
		}
		
	}
}

	
