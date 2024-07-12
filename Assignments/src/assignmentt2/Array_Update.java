package assignmentt2;

import java.util.Arrays;
import java.util.Scanner;

//WAP to update specific array element by given element.

public class Array_Update {

	public static void main(String[] args) {

		int a[]= {7, 0, 1, 6, 1, 9, 2, 5, 9, 2};
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element to update: ");
        int index = scanner.nextInt();
        System.out.println("Enter the value of the element to update: ");
        int value = scanner.nextInt();
        
        a[index]=value;
        System.out.println(Arrays.toString(a));
//        System.out.println("Updated array:");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
		
	}

}
