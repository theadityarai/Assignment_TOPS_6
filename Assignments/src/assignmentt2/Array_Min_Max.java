package assignmentt2;
//WAP to find the maximum and minimum value of an array

public class Array_Min_Max {

	public static void main(String[] args) {
		int a[]= {7, 0, 1, 6, 1, 9, 2, 5, 9, 2};
		int max = a[0];
	    int min = a[0];

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] > max) {
	                max = a[i]; 
	            }
	            if (a[i] < min) {
	                min = a[i]; 
	            }
	        }
	        System.out.println("Maximum value in the array: " + max);
	        System.out.println("Minimum value in the array: " + min);
	}

}
