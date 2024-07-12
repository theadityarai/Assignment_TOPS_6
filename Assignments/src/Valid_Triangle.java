
public class Valid_Triangle {
/*
 * 2.condiiton---Write a program to check whether a triangle is valid or not, 
when the three angles of the triangle are entered through the 
keyboard. A triangle is valid if the sum of all the three angles 
is equal to 180 degrees.
 */
	public static void main(String[] args) {
		
		int a=1200, b=10, c=50;
		
		if (a+b+c==180) {
			System.out.println("Valid Triangle");
		}else {
			System.out.println("Invalid Triangle");
		}
	}
}
