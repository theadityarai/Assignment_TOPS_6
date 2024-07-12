// W.A.J.P to check given number is Prime or not?

package assignmentt2;

import java.util.Scanner;

public class Prime_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num= sc.nextInt();
	int flag=1;
	
	if (num <= 1) {
        flag = 2;
    } else {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 2;
                break;
            }
        }
    }

    if (flag == 1) {
        System.out.println(num + " is Prime");
    } else {
        System.out.println(num + " is Not Prime");
    }
}

}
