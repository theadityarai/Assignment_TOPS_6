
public class May24_Assignment {


	
	public static void main(String[] args) {
	
	System.out.println("");
	System.out.println("Question 1");
	
/*Ramesh’s basic salary is input through the keyboard. His dearness allowance is 40% of basic salary, and house rent  allowance is 20% of basic salary. Write a program to calculate  his gross salary. */		
	int salary= 16000;
	int da= 16000*40/100;
	int hra= 16000*20/100;
	int gross_salary= salary + da+ hra;
	
	System.out.println("Ramesh's Gross Salary is: " + gross_salary);
	
	System.out.println("");
	System.out.println("Question 2");

/*The distance between two cities (in km.) is input through the keyboard. Write a program to convert and print this distance  in meters, feet, inches and centimeters*/
	
	
	int distance_km= 10;
	int distance_meter= distance_km*1000;
	double distance_feet= distance_km*3280.84;
	double distance_inch= distance_km*39370.1;
	double distance_cm= distance_km*100000;
	
	
	
	System.out.println("Distance in KM:" + distance_km);
	System.out.println("Distance in Meter:" + distance_meter);
	System.out.println("Distance in Feet:" + distance_feet);
	System.out.println("Distance in Inch:" + distance_inch);
	System.out.println("Distance in CM:" + distance_cm);
	
	System.out.println("");
	System.out.println("Question 3");
	
/*If the marks obtained by a student in five different subjects  are input through the keyboard, find out the aggregate marks  and percentage marks obtained by the student. Assume that  the maximum marks that can be obtained by a student in each  subject is 100.*/
	
	int English= 84;
	int Maths= 75;
	int Hindi= 79;
	int Science= 65;
	int Social= 92;
	int TotalMarks= English+ Maths+ Hindi+ Science+ Social;
	float Percentage= TotalMarks*100/500;
	
	System.out.println("Total Marks is:"+ TotalMarks +"\n and Percentage is:"+ Percentage + "%");
	
	System.out.println("");
	System.out.println("Question 4");
	
	
/* Temperature of a city in Fahrenheit degrees is input through  the keyboard. Write a program to convert this temperature into Centigrade degrees.*/
	
	int Temp_Far =40;
	int Temp_Cel= (Temp_Far-32)*5/9;
	
	System.out.println("Current Temperature is "+ Temp_Cel+ "°C");
	
	System.out.println("");
	System.out.println("Question 5");
	
	
/*  The length & breadth of a rectangle and radius of a circle are  input through the keyboard. Write a program to calculate the  area & perimeter of the rectangle, and the area &  circumference of the circle */
	
	int Length_R= 5;
	int Breadth_R=10;
	int Radius_C= 12;
	
	int Area_R= Length_R*Breadth_R;
	int Perimeter_R= 2* (Length_R*Breadth_R);
	
	float Area_C= 22/7 * Radius_C*Radius_C;
	float Circumference_C= 2*22/7*Radius_C;
	
	System.out.println("Area of Rectangle is:"+ Area_R);
	System.out.println("Perimeter of Rectangle is:"+ Perimeter_R);
	System.out.println("Area of Circle is:"+ Area_C);
	System.out.println("Circumference of Circle is:"+ Circumference_C);
	
	System.out.println("");
	System.out.println("Question 6");
	
	
/* Two numbers are input through the keyboard into two locations C and D. Write a program to interchange the contents of C and D */
	
	
	int a= 10;
	int b= 20;
	System.out.println("Before Swapping "+ a+ " " + b);
	
	/* Method 1 */
//	a= a+b; //30
//	b= a-b; //30-20=10
//	a= a-b; //30-10=20
	
	/* Method 2 */
	a= a*b;
	b= a/b;
	a= a/b;
	
	System.out.println("After Swaping "+ a + " " + b );
	
	System.out.println("");
	System.out.println("Question 7");
	
/* If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits. */
	
	int no=38765, rem1, rem2, rem3, rem4, rem5;
	
	rem1= no%10; //5
	no= no/10;  //3876
	rem2= no%10;//6
	no= no/10; //387
	rem3= no%10;//7
	no= no/10;//38
	rem4= no%10;//8
	no= no/10;//3
	rem5= no%10;//3
	
	
	System.out.println(rem1 + " "+ rem2+ " " + rem3 +" "+ rem4+ " " + rem5);
	System.out.println("Sum =" + (rem1+rem2+rem3+rem4+rem5));
	
	System.out.println("");
	System.out.println("Question 8");
	
	
/*In a town, the percentage of men is 52. The percentage of  total literacy is 48. If total percentage of literate men is 35 of the total population, write a program to find the total number  of illiterate men and women if the population of the town is 80,000. */
	
	int totalPopulation = 80000;

    double percentMen = 52;
    double percentTotalLiterate = 48;
    double percentLiterateMen = 35;

    int totalMen = (int) (totalPopulation * percentMen / 100);
    int totalWomen = totalPopulation - totalMen;

    int literateMen = (int) (totalPopulation * percentLiterateMen / 100);
    int totalLiterate = (int) (totalPopulation * percentTotalLiterate / 100);
    int literateWomen = totalLiterate - literateMen;

    int illiterateMen = totalMen - literateMen;
    int illiterateWomen = totalWomen - literateWomen;

    System.out.println("Total illiterate men: " + illiterateMen);
    System.out.println("Total illiterate women: " + illiterateWomen);

	}
	

}
