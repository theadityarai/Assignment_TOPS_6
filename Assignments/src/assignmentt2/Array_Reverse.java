package assignmentt2;

import java.util.Arrays;

//WAP to reverse an array of integer values
public class Array_Reverse {
	public static void main(String[] args) {
		int a[] = {7, 0, 1, 6, 1, 9, 2, 5, 9, 2};
		System.out.println("Before Reverse: "+ Arrays.toString(a));
		for (int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
