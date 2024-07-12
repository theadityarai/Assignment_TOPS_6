
public class Leap_Year_Conditional_Operator {

	/*
	 * Write a program using conditional operators to determine 
whether a year entered through the keyboard is a leap year or 
not

	 */
	
	public static void main(String[] args) {
		int year=2020;
		
		if (year%4==0) {
			System.out.println(year+ " is Leap Year");
		}
		else if (year%100==0){
			System.out.println(year+ " is Leap Year");
		}
		else if (year%400==0) {
			System.out.println(year + " is Leap Year");
		}
			else {
				System.out.println(year + "Not a leap year");
			}
	}

}
