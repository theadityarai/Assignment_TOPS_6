package assignmentt2;

import java.util.Scanner;

//WAP to find the index of an array element

public class Array_Index {

	public static void main(String[] args) {
		int a[]= {7, 0, 1, 6, 1, 9, 2, 5, 9, 2};
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to find in the array: ");
        int element = scanner.nextInt();
        
        int index=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                index = i; 
                break; 
            }
        }

        
        if (index != -1) {
            System.out.println("Element " + element + " found at index: " + index);
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }


		
	}

}
