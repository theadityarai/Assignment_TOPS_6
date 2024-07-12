package assignmentt2;
//WAP to demonstrate try catch block.

public class Try_Catch {

	public static void main(String[] args) {

		int a=10, b=0;
		int [] num =new int[3];
		
		try {
			System.out.println("Div is: "+ a/b);
			for (int i=0; i<=3; i++) {
				num[i]=i+1;
				System.out.println(num[i]);
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("this code is written by Aditya");
			System.out.println("Phone no is 898745655");
			}
			
	}

}
