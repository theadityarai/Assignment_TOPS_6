package assignmentt2;

import java.util.Arrays;

// WAP to find the second largest element in an array
public class Array_Second_Largest {

	public static void main(String[] args) {

		int a[] = {7, 0, 1, 6, 1, 9, 2, 5, 9, 2};

		Arrays.sort(a);
		System.out.println("Second largest is: "+ a[a.length-2]);
	}

}
