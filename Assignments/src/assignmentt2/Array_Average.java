package assignmentt2;
//WAP to calculate the average value of array elements

public class Array_Average {

	public static void main(String[] args) {
		int[] a= {7,0,1,6,1,9,2,5,9,2};
		int sum=0;
		
		for (int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		double average=(double)sum/a.length;
				
		System.out.println("Array Sum is: "+ average);
	}

}
