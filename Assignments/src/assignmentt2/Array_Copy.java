package assignmentt2;

import java.util.Arrays;

// WAP to Copy one array into another

public class Array_Copy {
public static void main(String[] args) {
	int a[] = {7, 0, 1, 6, 1, 9, 2, 5, 9, 2};	
	int b[]= new int [a.length];
	
	for (int i=0; i<a.length;i++) {
		b[i]=a[i];
		
	}
	System.out.println("New Array B: "+Arrays.toString(b));
}
}
