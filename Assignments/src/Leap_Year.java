
public class Leap_Year {

/*
 * Condition Any year is input through the keyboard. Write a program to 
determine whether the year is a leap year or not. 
(Hint: Use the % (modulus) operator)
 */
	public static void main(String[] args) {
			
		int year =2000;
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


