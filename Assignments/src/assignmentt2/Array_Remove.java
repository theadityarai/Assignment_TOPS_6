package assignmentt2;
//WAP to remove the third element from a array list.

import java.util.ArrayList;
import java.util.Arrays;


public class Array_Remove {

	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(0);
        numbers.add(1);
        numbers.add(6);
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
	int remove = numbers.remove(2);
	System.out.println(numbers);
	}

}
