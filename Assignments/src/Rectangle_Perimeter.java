
public class Rectangle_Perimeter {

/*
 * 2.condition---Given the length and breadth of a rectangle, write a program to 
find whether the area of the rectangle is greater than its 
perimeter. For example, the area of the rectangle with length = 5 
and breadth = 4 is greater than its perimeter. 	
 */
	
	public static void main(String[] args) {
		int length=4,breadth=2;
		
		int area= length*breadth;
		int peri= 2*(length+breadth);
		
		if (area>peri) {
			System.out.println("Area is Bigger");
		}else {
			System.out.println("Perimeter is Bigger");
		}
	}

}
