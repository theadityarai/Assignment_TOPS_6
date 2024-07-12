package assignmentt2;
// WAP to sum values of an array

public class Array_Sum {

	public static void main(String[] args) {

		int[] a= {7,0,1,6,1,9,2,5,9,2};
		int sum=0;
		
		for (int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Array Sum is: "+ sum);
	}

}
