package assignmentt2;

import java.util.ArrayList;

//WAP to iterate through all elements in an array list

public class Array_Iterate {
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

    
    for (int i = 0; i < numbers.size(); i++) {
        System.out.println(numbers.get(i));
    }
}
}
